
import java.util.Scanner;

public class  Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			
			int n = Integer.parseInt(sc.next());
			int x = Integer.parseInt(sc.next());
			
			if(n == 0 && x == 0){
				break;
			}
			
			int answer = culculate(n,x);
			System.out.println(answer);
			
		}
		
		
		sc.close();
		
	}

	private static int culculate(int n, int x) {
		
		int answer = 0;
		
		for(int i = 1;i<=n;i++){
			
			for(int j = i+1; j<n;j++){
				
				for(int k = j+1;k<=n;k++){
					
					if(x == (i + j + k)){
						
						answer++;
						
					}
					
					
				}
			}
			
		}
		
		return answer;
	}
}

