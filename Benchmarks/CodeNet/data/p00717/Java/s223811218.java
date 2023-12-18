import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String line;
			while(true){
				/* input */
				line = br.readLine();

				int c = Integer.parseInt(line);
				if(c==0) return;

				Line[] d = new Line[c+1];

				//line 0
				int ln = Integer.parseInt(br.readLine());
				ArrayList<Coordinate> cd = new ArrayList<Coordinate>();

				for(int l=0;l<ln;l++){
					cd.add(new Coordinate(br.readLine()));
				}
				d[0] = new Line(cd);


				//line 1--c
				for(int k=1;k<=c;k++){
					ln = Integer.parseInt(br.readLine());
					cd = new ArrayList<Coordinate>();

					for(int l=0;l<ln;l++){
						cd.add(new Coordinate(br.readLine()));
					}
					d[k] = new Line(cd);
				}

				/* processing */
				//set the initial points to (0,0)
				for(int a=0;a<=c;a++){
					d[a] = d[a].setOrigin();
				}

				//find identical lines
				ArrayList<Integer> ans = new ArrayList<Integer>();

				for(int a=1;a<=c;a++){
					if(compareLines(d[0],d[a])){
						ans.add(a);
					}
				}
				
				for(int i : ans){
					System.out.println(i);
				}
				System.out.println("+++++");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static boolean compareLines(Line a, Line b){
		if(compareLines_rec(a,b)){
			return true;
		} else {
			return compareLines_rec(a,b.reverse());
		}
	}

	public static boolean compareLines_rec(Line a, Line b){
		if(a.points.size()!=b.points.size()) return false;
		boolean temp = true;

		//compare the lengths
		for(int i=0;i<a.points.size();i++){
			for(int j=0;j<a.points.size()-1;j++){
				if(a.lengths()[j]!=b.lengths()[j]){
					temp = false;
					break;
				}
			}
		}

		//compare the lengths in reverse order
		if(!temp){
			b = b.reverse();
			for(int i=0;i<a.points.size();i++){
				for(int j=0;j<a.points.size()-1;j++){
					if(a.lengths()[j]!=b.lengths()[j]){
						return false;
					}
				}
			}
		}
		a = a.setOrigin();
		b = b.setOrigin();
		
		
		int rotate = 0;
		//check if it's rotated based on the first point
		if(a.points.get(1).x!=0){
			if(b.points.get(1).x==a.points.get(1).x){
				rotate = 0;
			} else if(b.points.get(1).y==-a.points.get(1).x){
				rotate = 1;
			} else if(b.points.get(1).x==-a.points.get(1).x){
				rotate = 2;
			} else if(b.points.get(1).y==a.points.get(1).x){
				rotate = 3;
			}
		} else {
			if(b.points.get(1).y==a.points.get(1).y){
				rotate = 0;
			} else if(b.points.get(1).x==-a.points.get(1).y){
				rotate = 1;
			} else if(b.points.get(1).y==-a.points.get(1).y){
				rotate = 2;
			} else if(b.points.get(1).x==a.points.get(1).y){
				rotate = 3;
			}
		}

		b = b.rotate(rotate);
		//b.print();

		for(int i=0;i<a.points.size();i++){
			if(a.points.get(i).x!=b.points.get(i).x) return false;
			if(a.points.get(i).y!=b.points.get(i).y) return false;
		}

		return true;
	}

	static class Coordinate{
		public int x;
		public int y;

		public Coordinate(String str){
			this.x = Integer.parseInt(str.split(" ")[0]);
			this.y = Integer.parseInt(str.split(" ")[1]);
		}

		public Coordinate(int x, int y){
			this.x = x;
			this.y = y;
		}

		public void output(){
			System.out.println(this.x + "," + this.y);
		}

		public int length(){
			return Math.abs(this.x - this.y);
		}

		public void modify(int x, int y){
			this.x = x;
			this.y = y;
		}
	}

	static class Line{
		public ArrayList<Coordinate> points;

		public Line(){
			this.points = null;
		}

		public Line(ArrayList<Coordinate> c){
			this.points = c;
		}
		
		public void print(){
			for(Coordinate c : this.points){
				System.out.println(c.x + "," + c.y);
			}
		}
		
		public Line reverse(){
			Collections.reverse(this.points);

			return this;	
		}

		public Line setOrigin(){
			//set the initial points to (0,0)
			int x0 = this.points.get(0).x;
			int y0 = this.points.get(0).y;
			if(x0==0&&y0==0){
				return this;
			}
			for(int b=0;b<this.points.size();b++){
				this.points.get(b).modify(this.points.get(b).x-x0,this.points.get(b).y-y0);
			}
			return this;
		}

		public int[] lengths(){
			int[] lengths = new int[this.points.size()-1];
			for(int i=0;i<this.points.size()-1;i++){
				lengths[i] = Math.abs(this.points.get(i).x-this.points.get(i+1).x)+Math.abs(this.points.get(i).y-this.points.get(i+1).y);
			}
			return lengths;
		}

		public Line rotate(int r){
			switch(r){
			case 1:
				for(int i=1;i<this.points.size();i++){
					int x = this.points.get(i).x;
					int y = this.points.get(i).y;
					this.points.get(i).modify(-y,x);
				}
				break;
			case 2:
				for(int i=1;i<this.points.size();i++){
					int x = this.points.get(i).x;
					int y = this.points.get(i).y;
					this.points.get(i).modify(-x,-y);
				}
				break;
			case 3:
				for(int i=1;i<this.points.size();i++){
					int x = this.points.get(i).x;
					int y = this.points.get(i).y;
					this.points.get(i).modify(y,-x);
				}
				break;
			default:
				break;
			}
			return this;
		}
	}
}