import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Integer N=sc.nextInt();
        Integer[] t=new Integer[N+1];
        Integer[] x=new Integer[N+1];
        Integer[] y=new Integer[N+1];
        Boolean b=true;
        t[0]=x[0]=y[0]=0;

        for(int i=1;i<=N;i++){
            t[i]=sc.nextInt();
            x[i]=sc.nextInt();
            y[i]=sc.nextInt();
            Integer d=Math.abs(t[i]-t[i-1])-Math.abs(x[i]-x[i-1])-Math.abs(y[i]-y[i-1]);
            if(d<0||d%2>0){
                b=false;
            }
        }

        System.out.println(b?"Yes":"No");

	}
}
