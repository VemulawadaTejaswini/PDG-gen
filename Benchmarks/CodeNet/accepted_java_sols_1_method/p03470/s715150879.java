import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int N=sc.nextInt();
		int[] d=new int[100];
		int i,k,cnt=1,min;
		for(i=0;i<N;i++) {
			d[i]=sc.nextInt();
		}
		for(i=0;i<N-1;i++){
		      for(k=N-1;k>i;k--){
		    	  if(d[k]<d[k-1]){
		    		  int t=d[k];
		    		  d[k]=d[k-1];
		    		  d[k-1]=t;
		    	  }
		      }
		}
		min=d[0];
		for(i=1;i<N;i++) {
			if(min<d[i]) {
				cnt++;
				min=d[i];
			}
		}
		System.out.println(cnt);
	}
}

