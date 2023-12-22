import java.util.*;
class Main{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = sc.nextInt();
		int num;
		int sum = a + b + c;
		if(a>b){
			num = a;
		}else{
			num = b;
		}
		if(c>num){
			num = c;
		}
		sum = sum - num;
		for(int y=0; y<x; y++){
			num = num * 2;
		}
		System.out.println(num + sum);
	}
}
