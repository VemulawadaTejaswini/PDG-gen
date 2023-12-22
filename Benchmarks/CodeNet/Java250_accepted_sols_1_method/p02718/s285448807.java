import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int choiceNum = sc.nextInt();
        int[] voteNum  = new int[n];
        for(int i = 0; i<n; i++){
            voteNum[i] = sc.nextInt();
        }

        int sumVote = 0;
        for(int i = 0; i<n; i++){
            sumVote += voteNum[i];
        }
        
        double availableNum = sumVote * ( 1.0 / (4.0 * (double)choiceNum) );
        int count = 0;

        for(int i = 0; i<n; i++){
            if(voteNum[i] >= availableNum){
                count++;
            }
        }
        System.out.println(count >= choiceNum ? "Yes" : "No");
    }
}