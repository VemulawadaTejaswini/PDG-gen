import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a%2 != 0 && b%2 != 0){
			System.out.println("Odd");
		}else{
			System.out.println("Even");
		}
	}
}