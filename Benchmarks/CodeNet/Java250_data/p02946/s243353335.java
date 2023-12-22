import java.util.*;
public class Main {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int B= sc.nextInt();
		int data[] =new int[N*2-1];
		int count=0;
		for(int i=0;i<data.length;i++) {
			if(i<N-1) {
				data[i]=B-N+1+i;
			}else {
			
				data[i]=B+count;
				count++;
			}
			
		}
				
		
		
		for(int i=0;i<data.length;i++) {
			System.out.println(data[i]);	
		}
		
		
	}

}
