import java.util.*;
public class Main {
	public static void main(String[] args){
      
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();

        int current = 0;
        for (int i = 0; i < 6; i++) {
            current = current + ((int) Math.pow(10, i) * 7);
            if (current >= K) {
                if (current % K == 0) {
                    System.out.println(i + 1);
                    return;
                }
            }
        }

        System.out.println(-1);      

	}
}