

import java.util.Scanner;

public class Main {


	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int length	   = Integer.parseInt(sc.next());
		int breadth	   = Integer.parseInt(sc.next());
		Rectangle rec  = new Rectangle(length, breadth);
		
		System.out.println(rec.calculateArea() + " " + rec.calculatePerimeter());
		
		sc.close();
	}
	
	


}

class Rectangle{
	
	private int length;
	private int breadth;
	
	Rectangle(){
		throw new IllegalArgumentException("It is not acceptable.");
	}
	
	Rectangle(int length,int breadth){
		
		this.length = length;
		this.breadth = breadth;
		
	}
	
	public int getLength(){
		return this.length;
	}
	
	public int getBreadth(){
		return this.breadth;
	}
	
	public int calculatePerimeter(){
		return 2*this.length + 2* this.breadth;
	}
	
	public int calculateArea(){
		return this.length * this.breadth;
	}
	
}

