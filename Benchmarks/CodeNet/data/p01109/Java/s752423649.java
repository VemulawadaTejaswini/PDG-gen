import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		while(true){
			int n=sc.nextInt();
			if(n==0) break;
			int data[] = new int[n];
			double ave=0;
			for(int i=0;i<n;++i) {
				data[i]=sc.nextInt();
				ave+=data[i];
			}
			
			ave/=n;
			
			int count=0;
			for(int i=0;i<n;++i) {
				if(data[i]<=ave) count++;
			}
			
			System.out.println(count);
		}
	
	}

}

