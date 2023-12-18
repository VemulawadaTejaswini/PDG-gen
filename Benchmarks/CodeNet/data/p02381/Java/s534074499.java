import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            while(true){
                int n = sc.nextInt();
                if(n==0){break;}
                int[]scores=new int[n];
                for(int i = 0; i<scores.length;i++){
                    scores[i]=sc.nextInt();
                }
                double average = 0, variance = 0, sum = 0, SUM = 0;
                for(int j = 0; j<scores.length;j++){
                    sum += scores[j];
                }
                average = sum/scores.length;
                for(int k = 0; k<scores.length;k++){
                    SUM += (scores[k]-average)*(scores[k]-average);
                }
                variance = SUM/scores.length;
                System.out.println(Math.sqrt(variance));

            }
        }
    }
}
