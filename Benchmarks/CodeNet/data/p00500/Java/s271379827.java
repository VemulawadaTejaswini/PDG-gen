import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		int c[] = new int[n];
		int i;
	
		for(i = 0; i < n; i++){
		    a[i] = sc.nextInt();
		    b[i] = sc.nextInt();
		    c[i] = sc.nextInt();
		}
		int sam[] = new int[n];
		
		for(i = 0; i < n-1; i++ ){
			for(int j = i+1; j < n; j++){
				if(a[i] == a[j]){
					a[i] = 0;
					a[j] = 0;
					
				}else{
				}
			}
		}

		
		for(i = 0; i < n-1; i++ ){
			for(int j = i+1; j < n; j++){
				if(b[i] == b[j]){
					b[i] = 0;
					b[j] = 0;
				}
			}
		}

		
		for(i = 0; i < n-1; i++ ){
			for(int j = i+1; j < n; j++){
				if(c[i] == c[j]){
					c[i] = 0;
					c[j] = 0;
				}
			}
		}

		
		for(i = 0; i < n; i++){
			sam[i] = a[i] + b[i] + c[i];
			System.out.println(sam[i]);
		}
	}

}