import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int A[]=new int[5000000];
		for(int i=1;i<A.length;i++)A[i]=A[i-1]+i;

		while(true) {
			int b=in.nextInt();
			if(b==0)break;

			int maxn=0,q=0;
			for(int i=0;i<A.length-1;i++) {
				for(int j=i+1;j<A.length;j++) {

					int sub=A[j]-A[i];

					if(sub>b)break;
					else if(sub==b) {
						if(j-i>maxn) {
							maxn=j-i;
							q=i+1;
						}
					}
				}
			}
			System.out.println(q+" "+maxn);
		}
	}

}

