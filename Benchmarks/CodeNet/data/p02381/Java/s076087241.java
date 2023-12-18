import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        try(Scanner sc =new Scanner(System.in)){
            while(true){
                int n = sc.nextInt();
                if(n==0) break;
                int[] scores = new int[n];
                for(int i=0; i<scores.length; i++){
                    scores[i]=sc.nextInt();
                }
                double avg=0, var=0;
                for(int i=0; i<scores.length; i++){
                    avg+=scores[i];
                }
                avg/=scores.length;
                for(int i=0; i<scores.length; i++){
                    var+=Math.pow(avg-scores[i], 2);
                }
                var/=scores.length;
                System.out.println(Math.sqrt(var));
            }
        }
        
    }
}
