import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            while(true){
                int n = sc.nextInt();
                if(n == 0) break;
                int[] scores = new int[n];
                int sum = 0;
                for(int i=0; i < scores.length; i++){
                    scores[i] = sc.nextInt();
                    sum += scores[i];
                }
                double average,variance;
                average = 0; variance = 0;
                average = (double)sum / scores.length;
                double number = 0;
                for(int j=0; j < scores.length; j++){
                    number += ((double)scores[j] - average) * ((double)scores[j] - average);
                }
                variance = number / scores.length;
                System.out.println(Math.sqrt(variance));
            }
        }
    }   
}
