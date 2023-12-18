import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int n = sc.nextInt();
            if(n==0){
                break;
            }
            int[] score = new int[n];
            int max=0,min=1000;
            for(int i=0;i<n;i++){
                score[i] = sc.nextInt();
                if(max<score[i]){
                    max=score[i];
                }
                if(min>score[i]){
                    min=score[i];
                }
            }

            int count_max=0,count_min=0,sum=0,ans=0;
            for(int i=0;i<n;i++){
                if(score[i]==max && count_max==0){
                    count_max++;
                }else if(score[i]==min && count_min==0){
                    count_min++;
                }else if((score[i]!=max && score[i]!=min) || count_max!=0 ||count_min!=0){
                    sum += score[i];
                }
            }
            ans = sum / (n-2);
            System.out.println(ans);
        }     
    }
}
