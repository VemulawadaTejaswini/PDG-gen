
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			int A = sc.nextInt();
			int B = sc.nextInt();
			int T1 = 0;
			if (1<=N & N<=20) {
				if (1<=A & N<=100) {
					T1 = N * A;
				}
			}
			
			if (T1 >= B) {
				System.out.println(B);
			} else {
				System.out.println(T1);
			}
		}
	}
