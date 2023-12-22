import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numberOfProblems = sc.nextInt();
        int numberOfSubmissions = sc.nextInt();
        int[] wa = new int[numberOfProblems+1];
        int correct =0, penalties = 0;
         while (numberOfSubmissions-->0){
             int indexOfQuestion = sc.nextInt();
             String result = sc.next();

             if(wa[indexOfQuestion]==-1){
                 continue;
             }
             if(result.equals("WA")){
                 wa[indexOfQuestion]++;
             }else {
                 correct++;
                 penalties += wa[indexOfQuestion];
                 wa[indexOfQuestion] = -1;
             }
         }
        System.out.println(correct+ " "+penalties);
    }
}