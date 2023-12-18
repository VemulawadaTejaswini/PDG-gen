import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int n = sc.nextInt();
			if(n==0)break;
			int[] s = new int[n];
			int[] t = new int[n];
			for(int i=0;i<n;i++){
				s[i] = sc.nextInt();
			}
			
			int count = 0;
			while(true){
				int eq;
				for(int i=0;i<n;i++){
					eq = 0;
					for(int j=0;j<n;j++){
						if(s[i]==s[j])eq++;
					}
					t[i] = eq;
				}
				
				eq=0;
				for(int i=0;i<n;i++){
					if(s[i]==t[i])eq++;
				}
				if(eq==n){
					System.out.println(count);
					for(int i=0;i<n;i++){
						if(i!=0)System.out.print(" ");
						System.out.print(s[i]);
					}
					System.out.println();
					break;
				}
				count++;
				s = Arrays.copyOf(t,n);
				
			}
	
		}
		
	}	
}