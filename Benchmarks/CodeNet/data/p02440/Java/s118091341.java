
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		int[] box = new int[n];
		int Max=0,Min=0;
		for(int i=0;i<n;i++) {
		int t = sc.nextInt();
			box[i] = t;
		}
		
		int q = sc.nextInt();
		for(int i=0;i<q;i++) {
			int com = sc.nextInt();
			int b=0,e=0;
			
			switch(com) {
			
			case 0:
				b = sc.nextInt();
				e = sc.nextInt();
				
				Min = box[b];
				for(int j=b;j<e;j++) {
					
					if(Min > box[j]) Min = box[j];
				}
				
				System.out.println(Min);
				break;
				
			
			case 1:
				b = sc.nextInt();
				e = sc.nextInt();
				
				Max = box[b];
				for(int j=b;j<e;j++) {
					
					if(Max < box[j]) Max = box[j];
				}
				
				System.out.println(Max);
				break;
			}
		}
		
		
	}
}
