import java.util.Scanner;


public class Main {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int[] num = new int[52];
		String[] mark = new String[52];

		int[] s = new int[14];
		int[] h = new int[14];
		int[] c = new int[14];
		int[] d = new int[14];

		for(int i=1;i<=13;i++){
			s[i]=i;
			h[i]=i;
			c[i]=i;
			d[i]=i;
		}


		for(int i=0;i<n;i++){
			mark[i]=scan.next();
			num[i]=scan.nextInt();
		}

		for(int i=0;i<n;i++){
			if(mark[i].equals("S")) s[num[i]] = 0;
			if(mark[i].equals("H")) h[num[i]] = 0;
			if(mark[i].equals("C")) c[num[i]] = 0;
			if(mark[i].equals("D")) d[num[i]] = 0;
		}


		for(int i=1;i<=13;i++){
			if(s[i] !=0 )System.out.println("S "+s[i]);
		}
		for(int i=1;i<=13;i++){
			if(h[i] !=0 )System.out.println("H "+h[i]);
		}
		for(int i=1;i<=13;i++){
			if(c[i] !=0 )System.out.println("C "+c[i]);
		}
		for(int i=1;i<=13;i++){
			if(d[i] !=0 )System.out.println("D "+d[i]);
		}
	}

}