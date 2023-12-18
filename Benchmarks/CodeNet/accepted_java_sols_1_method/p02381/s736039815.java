import java.util.Scanner;
public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int n = sc.nextInt();
            if(n == 0) break;
            int[] s = new int[n];
            int sum = 0;
            for(int i = 0; i < n; i++){
                s[i] = sc.nextInt();
                sum += s[i];
            }
            double average = (double)sum / n;
            double variance = 0;
            for(int i = 0; i < n; i++){
                variance += (s[i] - average)*(s[i] - average)/n;
            }
            System.out.println((Math.sqrt(variance)));
        }
        sc.close();
    }
}

