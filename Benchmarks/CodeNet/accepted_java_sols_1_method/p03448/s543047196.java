import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        int C=sc.nextInt();
        int X=sc.nextInt();
        int ans=0;
        for(int i=0;A>=i;i++){
            for(int j=0;B>=j;j++){
                for(int k=0;C>=k;k++){
                if(500*i+100*j+50*k==X){
                    ans++;
                }
                }
            }
        }
        System.out.println(ans);
    }
}