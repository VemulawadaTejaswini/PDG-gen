import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][] ab=new int[n][2];
		int time=0;
		ArrayList<Integer> c=new ArrayList<Integer>();
		for(int i=0;i<n;i++){
			ab[i][0]=sc.nextInt();
			ab[i][1]=sc.nextInt();
		}
		Arrays.sort(ab,(a,b)->Integer.compare(a[1],b[1]));

		for(int i=0;i<n;i++){
				time+=ab[i][0];
				if(time>ab[i][1]){
					System.out.println("No");
					return;
				}
		}
		System.out.println("Yes");
	}
		
}