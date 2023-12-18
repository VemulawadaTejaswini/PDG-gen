import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int M=scanner.nextInt();
        int X=scanner.nextInt();
        boolean booleans[]=new boolean[N+1];
        for(int i=0;i<=N;i++){
            booleans[i]=false;
        }
        for(int i=0;i<M;i++){
            booleans[scanner.nextInt()]=true;
        }
        int a=0;
        int b=0;
        for(int i=1;i<X;i++){
            if(booleans[i]) a++;
        }
        for(int i=X+1;i<N;i++){
            if(booleans[i]) b++;
        }
        System.out.println(Math.min(a,b));
    }
}
