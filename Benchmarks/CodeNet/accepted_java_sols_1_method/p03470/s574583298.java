import java.util.Scanner;


public class Main{
    public  static void main(String[] args) {
    	try (Scanner sc = new Scanner(System.in)) {
    		int N=sc.nextInt();
    		int[] a=new int[N+1];
    		int turn=1;
    		for(int i=1; i<=N; i++) {
    			a[i]=sc.nextInt();
    		}
    		for(int i=1; i<=N; i++) {
    			for(int j=i+1; j<=N; j++) {
    				if(a[i]<a[j]) {
    					int num=a[j];
    					a[j]=a[i];
    					a[i]=num;
    				}
    			}
    		}//昇順に並び替える
    		for(int i=1; i<N; i++) {
    			turn++;
    			if(a[i]==a[i+1]) {
    				turn--;
    			}
    		}
    		System.out.println(turn);
    	}
    }
}