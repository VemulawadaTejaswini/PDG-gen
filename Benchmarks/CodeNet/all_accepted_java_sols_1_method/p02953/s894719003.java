import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
		int N = sc.nextInt();
		int[] h = new int[N];
		
		for(int i=0; i<N; i++) {
			h[i]= sc.nextInt();
		}
		
		int max = h[0];
		boolean b = true;
		for(int i=0; i<N; i++) {
			if(h[i]<max-1) {
				b = false;
				break;
			}
			if(h[i]>max) {
				max = h[i];
			}
		}
		System.out.println(b? "Yes":"No");
    }
}