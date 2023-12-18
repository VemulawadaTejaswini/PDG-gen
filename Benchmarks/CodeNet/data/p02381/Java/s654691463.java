import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        try(Scanner scanner = new Scanner(System.in);){
        

        while(true){
            int n = scanner.nextInt();
            if(n == 0){
                break;
        }

        int[] scores = new int[n];

        for(int i=0; i<scores.length; i++){
          scores[i] = scanner.nextInt();  
        }

        int sum1 = 0, sum2 = 0;
        double average = 0, variance = 0;
        for(int j=0; j<scores.length; j++){
            sum1 += scores[j];
            sum2 += scores[j] * scores[j];
        } 
        average = (double)sum1 / n;
        variance = (double)sum2 / n - average * average;
        
        System.out.println(Math.sqrt(variance));
       }
    }
    }
}
