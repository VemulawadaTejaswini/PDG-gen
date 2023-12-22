import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int n = sc.nextInt();
            if(n==0){
                break;
            }
            int [] S;
            S = new int[n];
            int Max=0;
            int Min=1024;
            int Sum=0;
            for(int i=0;i<n;i++){
                S[i] = sc.nextInt();
                if(Max<=S[i]){
                    Max = S[i];
                }
                if(Min >= S[i]){
                    Min = S[i];
                }
                Sum += S[i];

            }
            Sum = Sum - (Max + Min);
            int ave=0;
            ave = Sum / (n-2);
            System.out.println(ave);

        }
        

        sc.close();
    }
}
