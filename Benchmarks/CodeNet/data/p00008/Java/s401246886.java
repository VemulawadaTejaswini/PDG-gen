import java.util.Scanner;

public class Main
{
	private static int count(int n)
	{
		int cnt=0;
		for(int i=0;i<=9;i++){
			for(int j=0;j<=9;j++){
				for(int k=0;k<=9;k++){
					for(int l=0;l<=9;l++){
						if(i+j+k+l==n){
							cnt++;
						}
					}
				}
			}
		}
		return cnt;
	}
	public static void main(String[] args)
	{
		int n;
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			n=scan.nextInt();
			System.out.println(count(n));
		}
		scan.close();
	}
}