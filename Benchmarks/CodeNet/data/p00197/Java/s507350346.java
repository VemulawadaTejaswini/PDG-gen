import java.util.Scanner;
import java.lang.String;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        while(in.hasNextLine()){
	        String str = in.nextLine();
	        String [] array = str.split(" ");
	        int x = Integer.parseInt(array[0]);
	        int y = Integer.parseInt(array[1]);
	        
	        if(x==0 && y==0){ break; }
	        
	        if(x < y){ 
	        	int tmp = x;
	        	x = y;
	        	y = tmp;
	        }
	        
			Euclid euqlid= new Euclid(x, y);
			while(!euqlid.isAns()){}
			System.out.println(String.valueOf(euqlid.getX()) + " " + String.valueOf(euqlid.getStep()));
        }
	}
}

class Euclid{
	private int x;
	private int y;
	private int step;
	
	public Euclid(int x, int y){
		this.x = x;
		this.y = y;
		this.step = 0;
	}
	
	public void show(){
		System.out.println(this.x);
		System.out.println(this.y);
	}
	
	public boolean isAns(){
		this.step++;
		int rem = this.x % this.y;
		this.x = this.y;
		this.y = rem;
		if(rem == 0){ return true; }
		return false;
	}
	
	public int getX(){
		return this.x;
	}
	
	public int getY(){
		return this.y;
	}
	
	public int getStep(){
		return this.step;
	}
}