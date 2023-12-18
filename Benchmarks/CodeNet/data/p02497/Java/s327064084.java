import java.util.Scanner;

class Main{
	public static void main(String args[]){
		
	}
}

class Grading{
	int m,f,r;
	
	Grading(int m,int f,int r){
		this.m = m;
		this.f = f;
		this.r = r;
	}
	
	public String judge(){
		int sum = m+f;
		
		if(sum >= 80){
			return "A";
		}else if(80>sum && sum>=65){
			return "B";
		}else if(65>sum && sum>=50){
			return "C";
		}else if(50>sum && sum>=30){
			if(r>=50){
				return "C";
			}else{
				return "D";
			}
		}else{
			return "F";
		}
	}
}