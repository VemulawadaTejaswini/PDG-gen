import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int N=scan.nextInt();
        int i;
        int ans=0;
        for(i=0;i*i<=N;i++){
            ans=i*i;
        }
        System.out.println(ans);
    }
}