import java.util.*;
public class Main {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int A = sc.nextInt();
	int B = sc.nextInt();
	int C = sc.nextInt();
	int D = sc.nextInt();
	if(B - C <= 0 || D - A <= 0){
		System.out.println(0);
	}else{
		System.out.println(Math.min(B,D) - Math.max(A,C));
	}
	}
}
