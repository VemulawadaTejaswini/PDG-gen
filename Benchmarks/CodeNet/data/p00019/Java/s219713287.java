import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
		int n = sc.nextInt();
		long a = 1;
		if(n==0)a=0;
		for(;0<n;n--){
			a*=n;
		}
		System.out.println(a);
		}
	}
}