import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=Integer.parseInt(in.next()),L[]=new int[n+1],k=-1;
		for(int i=0;i<n;i++) {
			int a=Integer.parseInt(in.next());
			if(k==-1) {
				k++;
				L[k]=a;
			}
			else if(L[k]>a)L[k]=a;
			else if(a>L[k]){
				k++;
				L[k]=a;
			}
		}
		System.out.println(k+1);
	}

}

