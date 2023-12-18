import java.util.Scanner;
public class Main {


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
       int N=scan.nextInt();
        int X=scan.nextInt()-1;
        int Y=scan.nextInt()-1;
        int L[]=new int[N];
for(int i=1;i<N;i++){
    for(int j=0;j<i;j++){
 int R=Math.min(Math.abs(X-i)+1+Math.abs(j-Y),Math.abs(j-X)+1+Math.abs(i-Y));
      int  K=Math.min(Math.abs(i-j),R);
      L[K-1]=L[K-1]+1;
    }

}
for(int h=0;h<N-1;h++){System.out.println(L[h]);}


    }

}

