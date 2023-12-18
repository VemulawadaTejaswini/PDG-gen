import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<Box> box, boxClone;
		int[][] water;
		int d, n, m, l;
		int p, t;
		int x1, x2, y1, y2;
		d = sc.nextInt();
		for(int i = 0; i < d; i++){

			n = sc.nextInt();
			box = new ArrayList<Box>();
			x1 = 0;
			y1 = 50;
			for(int j = 0; j < n; j++){
				x2 = sc.nextInt();
				y2 = sc.nextInt();
				box.add(new Box(x1, y1, x2, y2));
				x1 = x2;
				y1 = y2;
			}
			x2 = 100;
			y2 = 50;
			box.add(new Box(x1, y1, x2, y2));

			m = sc.nextInt();
			water = new int[m][2];
			for(int j = 0; j < m; j++){
				water[i][0] = sc.nextInt();
				water[i][1] = sc.nextInt();
			}
			waterIn(box, water);

			l = sc.nextInt();
			for(int j = 0; j < l; j++){
				p = sc.nextInt();
				t = sc.nextInt();
				boxClone = deepCopy(box);
				setHeight(box, t);
				overFlow(box);
				level(box);
				System.out.println(search(box, p));
				box = boxClone;
			}
		}
	}
	static void waterIn(ArrayList<Box> box, int[][] water){
		for(int i = 0; i < box.size(); i++){
			for(int j = 0; j < water.length; j++){
				if(water[j][0] > box.get(i).x1 && water[j][0] < box.get(i).x2){
					box.get(i).flow += water[j][1];
				}
			}
		}	
	}
	static void setHeight(ArrayList<Box> box, int t){
		for(int i = 0; i < box.size(); i++)
			box.get(i).height = box.get(i).flow * t / (box.get(i).x2 - box.get(i).x1) / 30.0;
	}
	static void overFlow(ArrayList<Box> box){
		for(int i = 0; i < box.size(); i++){
			if(box.get(i).height > box.get(i).y1 || box.get(i).height > box.get(i).y2){
				if(box.get(i).y1 < box.get(i).y2){
					box.get(i-1).height += (box.get(i).height - box.get(i).y1) * (box.get(i).x2 - box.get(i).x1) / (box.get(i-1).x2 - box.get(i-1).x1);
					box.get(i).height = box.get(i).y1;
				}else if(box.get(i).y1 > box.get(i).y2){
					box.get(i+1).height += (box.get(i).height - box.get(i).y2) * (box.get(i).x2 - box.get(i).x1) / (box.get(i+1).x2 - box.get(i+1).x1);
					box.get(i).height = box.get(i).y2;
				}else{
					box.get(i-1).height += (box.get(i).height - box.get(i).y1) * (box.get(i).x2 - box.get(i).x1) / (box.get(i-1).x2 - box.get(i-1).x1) / 2;
					box.get(i+1).height += (box.get(i).height - box.get(i).y1) * (box.get(i).x2 - box.get(i).x1) / (box.get(i+1).x2 - box.get(i+1).x1) / 2;
					box.get(i).height = box.get(i).y1;
				}
			}
		}
	}
	static void level(ArrayList<Box> box){
		while(true){
			int count = 0;
			for(int i = 0; i < box.size()-1; i++){
				if(box.get(i).height >= box.get(i).y2 && box.get(i+1).height >= box.get(i).y2){
					box.get(i).full = 1;
					count++;
				}
			}
			if(count == 0)
				break;
			int left = 0, right = 0;
			int k = 0;
			double sum = 0;
			for(int i = 0; i < box.size()-1; i++){
				if(box.get(i).full == 1){
					if(k == 0){
						left = i;
						k = 1;
					}
					sum += box.get(i).height * (box.get(i).x2 - box.get(i).x1);
					continue;
				}
				if(k == 0)
					continue;
				right = i;
				box.get(left).x2 = box.get(right).x2;
				box.get(left).y2 = box.get(right).y2;
				box.get(left).height = sum / (box.get(right).x2 - box.get(left).x1);
				box.get(left).full = 0;
				for(int j = left+1; j <= right; j++)
					box.remove(j);
				k = 0;
				sum = 0;
				i = left;
			}
		}
	}
	static double search(ArrayList<Box> box, int x){
		double height = -1;
		for(int i = 0; i < box.size(); i++){
			if(x > box.get(i).x1 && x < box.get(i).x2){
				height = box.get(i).height;
				break;
			}
		}
		return (height <= 50 ? height : 50);
	}
	static ArrayList<Box> deepCopy(ArrayList<Box> box){
		ArrayList<Box> boxClone = new ArrayList<Box>();
		for(int i = 0; i < box.size(); i++)
			boxClone.add(box.get(i).clone());
		return boxClone;
	}
}

class Box implements Cloneable{
	int x1, x2;
	int y1, y2;
	int full = 0;
	int flow = 0;
	double height;
	Box(int p1, int q1, int p2, int q2){
		x1 = p1;
		y1 = q1;
		x2 = p2;
		y2 = q2;
	}
	public Box clone(){
		try{
			Box cloned = (Box)super.clone();
			return cloned;
		}catch(CloneNotSupportedException e){
			return null;
		}
	}
}