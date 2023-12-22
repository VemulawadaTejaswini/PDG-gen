import java.util.*;

class Main{


	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int answer = 0;
		
		if(a==b) answer = c;
		if(a==c) answer = b;
		if(b==c) answer = a;

		System.out.println(answer);


		
	}
}