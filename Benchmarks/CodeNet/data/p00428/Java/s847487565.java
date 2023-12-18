import java.util.*;
class Main{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		int n,m;
		while((((n=s.nextInt())&(m=s.nextInt()))!=0)) {
			place[] in = new place[m];
			for(int i=0;i<in.length;i++)
				in[i]=new place(i+1);
			for(int i=0;i<n;i++) {
				for(int j=0;j<in.length;j++)
					in[j].c+=Byte.parseByte(s.next());
			}
			Arrays.sort(in, (o1, o2) -> o2.c-o1.c);
			System.out.print(in[0].no);
			for(int i=1;i<in.length;i++)
				System.out.printf(" %d",in[i].no);
			System.out.println();
		}
	}
}
class place{
	int c=0,no;
	place(int no) {
		this.no=no;
	}
}