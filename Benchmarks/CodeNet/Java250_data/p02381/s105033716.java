import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
        int n = sc.nextInt();
        if(n==0)break;
        int[] scores = new int[n];
        for(int i=0;i<scores.length;i++){
            scores[i] = sc.nextInt();
            }
            double sum=0,ave=0,vars=0,var=0;
        for(int i=0;i<n;i++){
            sum = sum+scores[i];
        }
        ave = (double)sum /n;
        for(int i=0;i<n;i++){
            vars = vars+((scores[i]-ave)*(scores[i]-ave));
        }
        var = (double)vars/n;
        System.out.println(Math.sqrt(var));
        }
    }
}

