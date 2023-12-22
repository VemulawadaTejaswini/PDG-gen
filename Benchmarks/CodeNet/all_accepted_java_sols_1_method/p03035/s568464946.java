import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a < 6){
			System.out.print(0);
		}else if(a < 13){
			System.out.print(b/2);
		}else{
			System.out.print(b);
		}
	}
}
