import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			int N =sc.nextInt();
			int M =0;
			int L =0;
			
				for(int i=0; i<=N/4; i++){
					M=N-4*i;
				
					if(M%7==0){
						L++;
					}
				}
					if(L>=1){		
						System.out.println("Yes");
					} else {
						System.out.println("No");
					}
	}
}