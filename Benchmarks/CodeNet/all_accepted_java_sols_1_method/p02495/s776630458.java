import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc =  new Scanner(System.in);
		
		while(true){
		
		int H = sc.nextInt();
		int W = sc.nextInt();
		//System.out.println();
			
		if(H==0&&W==0) break;
		int p,q;
		for(int j=0;j<=H-1;j++){
			if (j%2==0)	{p=0; q=1;}	
			else		{p=1; q=0;}
			for(int i=0;i<=W-1;i++){
				if(i%2==p)	System.out.printf("#");
				if(i%2==q)	System.out.printf(".");
			}	
			System.out.println();
		}
			System.out.println();
		}
	}
}