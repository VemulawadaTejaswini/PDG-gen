import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            while(true){
                int n = sc.nextInt();
                if(n == 0){
                    break;
                }
                int[] scores = new int[n];
                for(int i = 0;i < scores.length;i++){
                    scores[i]=sc.nextInt();
                }
                double avg = 0, variance = 0;
                for(int j = 0; j < scores.length;j++){
                    avg = avg + scores[j];
                }
                avg = (double)avg/scores.length;
                for(int k = 0;k < scores.length;k++){
                    variance = variance+Math.pow(scores[k]-avg, 2);
                }
                variance = variance/n;
                System.out.println(Math.sqrt(variance));
        }
    }
}
}
