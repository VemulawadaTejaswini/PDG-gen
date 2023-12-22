import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int L = sc.nextInt();
		
		String A[] =new String[N];
		for(int i=0;i<N;i++){
            A[i]=sc.next();
            
        }
		String ans="";
		
		Arrays.sort(A);
		
		for(int i=0;i<N;i++){
            ans+=A[i];
            
        }
        
        
        System.out.println(ans);
		
		
		
	}
}
