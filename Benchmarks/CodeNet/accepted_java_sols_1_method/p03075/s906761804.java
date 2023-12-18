import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int k = sc.nextInt();
		boolean flag = true;
		if(b -a >k){
			flag = false;
		}else if(c - a>k){
			flag = false;
		}else if(d - a>k){
			flag = false;
		}else if(e - a>k){
			flag = false;
		}else if(c - b>k){
			flag = false;
		}else if(d - b>k){
			flag = false;
		}else if(e - b >k){
			flag = false;
		}else if(d - c> k){
			flag = false;
		}else if(d - e > k){
			flag = false;
		}
		System.out.print(flag?"Yay!":":(");
	}
}
