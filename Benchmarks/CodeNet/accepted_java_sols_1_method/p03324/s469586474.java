
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int D=sc.nextInt();
		int N=sc.nextInt();
		if(N==100)N++;
		switch(D) {
		case 0:break;
		case 1:N*=100;break;
		case 2:N*=10000;break;

		}
		System.out.println(N);
	}

}
