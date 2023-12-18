import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		final int N = 100_0000;
		int n = sc.nextInt();
		int q = sc.nextInt();
		int sqrtn = (int)Math.sqrt(N);
		
		int backet[] = new int[sqrtn+1];
		int content[] = new int[N];
		
		for(int qq = 0; qq < q; ++qq){
			int a = sc.nextInt();
			int v = sc.nextInt();
			--a;
			
			content[a] += v;
			int maxi = Integer.MIN_VALUE;
			for(int i = 0; i < sqrtn; ++i){
				maxi = Math.max(maxi, content[sqrtn * (a/sqrtn) + i]);
			}
			backet[a/sqrtn] = maxi;

			int ind = -1;
			maxi = Integer.MIN_VALUE;
			for(int i = 0; i < sqrtn+1; ++i){
				if( maxi < backet[i] ){
					ind = i;
					maxi = backet[i];
				}
			}
			
			for(int i = 0; i < sqrtn; ++i){
				if( maxi == content[sqrtn * ind + i] ) {
					ind = sqrtn * ind + i;
					break;
				}
			}
			
			System.out.println(1+ind + " " + maxi);
		
		}
	}
}