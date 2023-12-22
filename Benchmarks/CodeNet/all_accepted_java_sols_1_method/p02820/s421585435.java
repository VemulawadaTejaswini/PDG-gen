import java.util.*;

public class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);

		int n=s.nextInt(),k=s.nextInt();
		int[]w={s.nextInt(),s.nextInt(),s.nextInt()};
		String t=s.next();

		int[][]a=new int[k][3];
		for(int i=0;i<n;++i) {
			int[] A = a[i%k];
			int p = Math.max(A[1],A[2]);
			int q = Math.max(A[2],A[0]);
			int r = Math.max(A[0],A[1]);
			A[0]=p;
			A[1]=q;
			A[2]=r;
			int j="spr".indexOf(t.charAt(i));
			A[j]+=w[j];
		}

		int v=0;
		for(int i=0;i<k;++i)
			v+=Arrays.stream(a[i]).max().getAsInt();
		System.out.println(v);

	}
}
