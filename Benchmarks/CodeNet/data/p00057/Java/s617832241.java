import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 1)n = 2;
			else n = n*n-n+1;
			System.out.println(n);
		}
	}
}