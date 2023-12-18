import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int D = sc.nextInt();
    	int X = sc.nextInt();
    	int count = 0;
    	for (int i = 0; i < N; i++) {
			int Ai = sc.nextInt();
			int day = 1;
			int eat = 0;
			while (day <= D) {
				eat++;
				day += Ai;
			}
			count += eat;
		}
    	System.out.println(count + X);
    }
}