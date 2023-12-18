import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(true){
            int n = scan.nextInt();
            if(n==0){
                break;
            }
            int scores[] = new int[n];
            for(int i=0;i<n;i++){
                scores[i]=scan.nextInt();
            }
            double average=0;
            double variance=0;
            double sum=0;
            for(int i=0;i<scores.length;i++){
                sum = sum + scores[i];
            }
            average = sum/n;
            double sumsum=0;
            for(int i=0;i<scores.length;i++){
                sumsum = sumsum + Math.pow(scores[i] - average,2);
            }
            variance = sumsum/n;
            System.out.println(Math.sqrt(variance));
        }
        scan.close();
    }
}
