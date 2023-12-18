import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=0;
        int[] x=new int[101];
        int N = sc.nextInt();
        int T = sc.nextInt();
        int E = sc.nextInt();
        for(int i=1; i<=N; i++) {
        	x[i]=sc.nextInt();
        }
        for(int i=-E; i<=E; i++) {
        	for(int j=1; j<=N; j++) {
        		for(int k=1; k<1000; k++)
        		if(x[j]*k==T+i) num=j;
        	}
        }
        if(num == 0)	System.out.println("-1");
        else        System.out.println(num);
        
    }
}

