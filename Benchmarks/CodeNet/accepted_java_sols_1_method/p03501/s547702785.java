import java.util.*;

public class Main{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int A=sc.nextInt();
		int B=sc.nextInt();
		
			try {
				if((N>=1&&N<=20)&&(A>=1&&A<=100)&&(B>=1&&B<=2000)){
					int m=(N*A)>B?B:(N*A);
					System.out.println(m);
				}
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		
		
	}

}