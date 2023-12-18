import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[] N=new int[a];
		for(int i=0;i<b*2;i++) {
			int M = sc.nextInt();
			++N[M-1];
		}
		for(int i=0;i<a;i++){
			System.out.println(N[i]);
		}
	}
}