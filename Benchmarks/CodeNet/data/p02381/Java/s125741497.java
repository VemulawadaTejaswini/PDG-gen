import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in )){
            while(true){
                int n = sc.nextInt();
                if (n == 0) {
                    break;
                }
                int[] scores = new int[n];
                double ave = 0, var = 0;
                for (int i = 0; i < scores.length; i++) {
                    scores[i] = sc.nextInt();
                    ave += scores[i];
                }
                ave = ave / scores.length;
                for (int i = 0;i < scores.length; i++){
                    var += (scores[i]-ave)*(scores[i]-ave);
                }
                var = var/ scores.length;

                System.out.println(Math.sqrt(var));
            }
        }
    }
}

