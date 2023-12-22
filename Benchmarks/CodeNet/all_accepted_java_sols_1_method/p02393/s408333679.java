import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sin = new Scanner(System.in);
		
		//int a, b, c;
		//a = sin.nextInt();
		//b = sin.nextInt();
		//c = sin.nextInt();
		
		//if(a < b && b < c){
		//	System.out.println("Yes");
		
		//}else{
		//	System.out.println("No");
		//}
		
		int a, b, c, 一, ニ, 三;
		a = sin.nextInt();
		b = sin.nextInt();
		c = sin.nextInt();
		//output"A B C"
		
		if(a < b){
			if(b < c){
				一 = a;
				ニ = b;
				三 = c;
			}else if(a < c){
				一 = a;
				ニ = c;
				三 = b;
			}else{
				一 = c;
				ニ = a;
				三 = b;
			}
		}else{ //b < a
			if(c < b){
				一 = c;
				ニ = b;
				三 = a;
			}else if(c < a){ // b<c
				一 = b;
				ニ = c;
				三 = a;
			}else{ // b<a,b<c,a<c=b<a<c 
				一 = b;
				ニ = a;
				三 = c;
			}
		}
		
		System.out.println(一 +" "+ ニ +" "+ 三);
		
	}
}

