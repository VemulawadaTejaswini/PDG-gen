import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in); 
        while(true){
            int n = scan.nextInt();
            if(n==0){ break; }
            double[] s = new double[n];
            int i = 0;
            double sum = 0;
            double sumHensa = 0; 
            double ans = 0;

            for(i=0;i<n;i++){
                s[i] = scan.nextDouble();
                sum += s[i];
            }

            double average = (double) sum / n;

            for(i=0;i<n;i++){
                sumHensa += (s[i] - average) * (s[i] - average);
            }

            ans = Math.sqrt( (double) sumHensa / n );
            System.out.println(ans);
        }
        
    }

}
