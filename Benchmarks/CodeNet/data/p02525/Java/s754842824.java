import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                while (true) {
                        int n = sc.nextInt();
                        if (n == 0) { break; }
                        int[] scores = new int[n];
                        for (int i = 0; i < scores.length; i++) {
                                scores[i] = sc.nextInt();
                        }
                        double average = 0, variance = 0,x=0;
                        int sum=0;
                        for(int j=0;j<n;j++){
                                sum=sum+scores[j];
                        }
                        average=sum/n;
                        for(int k=0;k<n;k++){
                        x=x+(scores[k]-average)*(scores[k]-average);
                        }
                        variance=x/n;
                        System.out.println(Math.sqrt(variance));
                }
        }
}