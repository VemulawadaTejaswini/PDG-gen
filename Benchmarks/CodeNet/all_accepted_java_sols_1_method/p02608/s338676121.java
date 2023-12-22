import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int p[]=new int [N+1];
        int t[]=new int [N+1];
        int d[]=new int [N+1];
for(int i=1;i<Math.sqrt(N);i++){


    for(int j=1;j<=i;j++){

        for(int k=1;k<=j;k++){
            int n=(int)(Math.pow(i+j,2)+Math.pow(i+k,2)+Math.pow(k+j,2))/2;
            if(n>N){n=N+1;}
            p[n-1]++;
if(i==j&&j==k){t[n-1]++;}
else if(i==j||j==k||k==i){d[n-1]++;}
        }



    }


}
for(int i=0;i<N;i++){System.out.println(d[i]*3+(p[i]-d[i]-t[i])*6+t[i]);}
    }
}