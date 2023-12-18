import java.util.Scanner;

 public class Main{
	 public static void main(String[] args){
		 Scanner s = new Scanner(System.in);
		 while(s.hasNextInt()){
			 int a = s.nextInt();
			 int b = s.nextInt();
			 int c = a;
			 int d = b;
			 int max = a;
			 int mox = b;
			 int mix = max;
			while(max != mox){
				if(mox > max){max = mox; mox = mix;}
				max = max - mox;
				mix = max;
			}
			while(a!=b){
				if(a<b) a += c;
				if(a>b) b += d;
			}
			System.out.println(mox+" "+a);
		 }
		 }
	 } 