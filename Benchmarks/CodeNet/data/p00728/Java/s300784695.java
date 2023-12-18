import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        while(true){
            int n=scan.nextInt();
            if(n==0) break;
            int[] score=new int[n];
            int maxflag=0;
            int minflag=0;
            int max=0,min=0;
            for(int i=0;i<n;i++){
                score[i]=scan.nextInt();
                if(i==0){
                    max=score[0];
                    min=score[0];
                }
                else{
                    if(max < score[i]) max=score[i];
                    if(min>score[i]) min=score[i];
                }
            }
            int ave=0;
            for(int i=0;i<n;i++){
                if(score[i]==max&&maxflag==0) maxflag++;
                else if(score[i]==min&&minflag==0) minflag++;
                else{
                    ave+=score[i];
                }
            }
            ave/=(n-2);
            System.out.println(ave);

        }
    }
}
