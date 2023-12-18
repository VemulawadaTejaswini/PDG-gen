import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	
	
	static boolean[] status=new boolean[1100002];
	static void siv()
	{
		int N=1000000;
		int sq=(int) Math.sqrt(N);
		for(int i=4;i<=N;i+=2) status[i]=true;
		for(int i=3;i<=sq;i+=2){
			if(status[i]==false)
			{		
				for(int j=i*i;j<=N;j+=i) status[j]=true;
			}
		}
		status[1]=true;
		
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		siv();
		try {
			while(scan.hasNext()){
				int n=scan.nextInt();
				int c=0;
				for (int i = 1; i <= n; i++) {
					if(!status[i])
						c++;
				}
				System.out.println(c);
			}
					
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
		


}