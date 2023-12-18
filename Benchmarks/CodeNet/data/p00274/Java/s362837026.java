import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		while(true){
			int n=sc.nextInt();
			boolean f = false;
			if(n==0)break;
			int count = 0,sum =0;
			
			for(int i=0;i<n;i++){
				int data = sc.nextInt();
				if(data<2)f=true;
				
				if(data==0)count++;
				sum +=data;
			}
			if(sum<=2||f)System.out.println("NA");
			else System.out.println((n+1-count));
			
		}
		
		sc.close();
		
	}

}

