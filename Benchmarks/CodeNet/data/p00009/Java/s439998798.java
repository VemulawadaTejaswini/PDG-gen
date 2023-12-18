import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int in = sc.nextInt();
			boolean[] isComposite = new boolean[Math.max(in-1, 1)];
			int out = 0;
			for (int i = 2; i <= in; i++){
				if(!isComposite[i-2]){
					if(isPrime(i)){
						out++;
						for(int j = i; j <= in; j +=i){
							isComposite[j-2] = true;
						}
					}
				}
			}
			System.out.println(out);
		}
	}
	
	
	
	
	private static boolean isPrime(int i){
		boolean res = false;
		
		if(i >= 2){
			boolean flag = false;
			for (int j = 2; j <= Math.sqrt(i); j++){
				flag = flag || (i%j == 0);
				
			}
			res = !flag;
		}
		return res;
	}
}