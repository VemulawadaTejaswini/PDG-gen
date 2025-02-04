import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int n=sc.nextInt();
			int[] a=new int[n];
			for(int i=0;i<n;i++) a[i]=sc.nextInt();
			int min=Integer.MAX_VALUE;
			for(int i=-100;i<=100;i++){
				int sum=0;
				for(int j=0;j<n;j++) sum+=(i-a[j])*(i-a[j]);
				min=Math.min(sum,min);
			}
			System.out.println(min);
		}
	}
}