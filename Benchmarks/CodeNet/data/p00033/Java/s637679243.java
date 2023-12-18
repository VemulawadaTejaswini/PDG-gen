import java.util.*;
public class Main { 
	static int[] l;
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int n=x.nextInt();
		for(int i=0;i<n;i++) {
			l=new int[10];
			for(int j = 0; j < 10; j++)l[j]=x.nextInt();
			System.out.println((s(0,0,0)==1)?"YES":"NO");
		}
	}
	static int s(int L, int R, int c) {
		if(c==10)return 1;
		int a=l[c];
		if((c==10)||(L<a&&s(a,R,c+1)==1)||(R<a&&s(L,a,c+1)==1))return 1;
		return 0;
	}
}