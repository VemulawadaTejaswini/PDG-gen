import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int[] x,n,N;
        x = new int[300];
        n = new int[100];
        N = new int[1000];


        for(int i=0;;i++){
            n[i] = sc.nextInt();
            x[i] = sc.nextInt();
            if(x[i]==0 && n[i]==0)  break;
            for(int j= (x[i]-n[i]<3 ? x[i]-3:n[i]);j>x[i]/3;j--){
                int y=0;
                y = x[i] - j;
                for(int k=(y<j ? y-1:j-1);k>y/2;k--){
                    if(k!=y-k && j!=k && j!=y-k )  N[i]++;
                }
            }
            System.out.println(N[i]);

        }

    }
}
