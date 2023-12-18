import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		while(sc.hasNextInt()){
			
			
			
			int n=sc.nextInt();
			if(n==0) break;
			int count=0;
			boolean judge=true;
			for(int i=0;i<n;i++){
				int singi=sc.nextInt();
				if(singi>0) count++;
				if(singi>1) judge=false;
			}
			if(judge) System.out.println("NA");
			else System.out.println(count+1);
		}
	}

}