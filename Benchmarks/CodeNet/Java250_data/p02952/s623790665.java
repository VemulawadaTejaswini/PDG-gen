import java.util.*;
 
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int digit = String.valueOf(n).length();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (String.valueOf(i).length() % 2 == 1) {
                sum++;
            }
        }

        System.out.println(sum);
	}
}
