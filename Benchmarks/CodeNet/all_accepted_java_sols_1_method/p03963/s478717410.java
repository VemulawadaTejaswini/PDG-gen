import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int n=sc.nextInt(),k=sc.nextInt();
			int ans=k;
			for(int i=0;i<n-1;i++) ans*=(k-1);
			System.out.println(ans);
		}
	}
}