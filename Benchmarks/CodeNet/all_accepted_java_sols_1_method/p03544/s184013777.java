import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int N=scan.nextInt();
        long[] L=new long[3];
        int i;
        L[0]=2;
        L[1]=1;
        for(i=2;i<=N;i++){
            L[i%3]=L[(i+1)%3]+L[(i+2)%3];
            //System.out.println(L[i%3]);
        }
        System.out.println(L[(i-1)%3]);
    }
}