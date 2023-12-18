import java.util.*;
public class Main {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int B= sc.nextInt();
		int data[] =new int[3];
		data[0]=N-B;
		data[1]=N*B;
		data[2]=N+B;
		int max=-100;
		for(int i=0;i<3;i++) {
			if(max<data[i]) {
				max=data[i];
			}
			
		}
				
		
		
		
		System.out.println(max);
		
	}

}
