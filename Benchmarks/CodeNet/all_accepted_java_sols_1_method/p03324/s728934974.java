import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int D = sc.nextInt();
		int N = sc.nextInt();
		
		if(N==100){N++;}
		
		switch(D){
		case 2:
			N*=100;
		case 1:
			N*=100;
		case 0:
		default: 
			break;
		
		}
		System.out.println(N);
	}
}