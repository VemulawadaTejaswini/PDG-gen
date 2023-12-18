import java.util.Scanner;

class Main{
	public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
		int n = a.length();
        int x[] = new int[n];
        for(int i = 0; i < n; i++){
            char c = a.charAt(i);
        	x[i] = c - '0';
        }
		
		long answer = 0;
		for(int i = 0; i < (Math.pow(2,n-1)); i++){
			boolean y[] = new boolean[n-1];
			for(int j = 0; j < n-1; j++){
				if((1 & i >> j) == 1){
					y[j] = false;
				}else{
					y[j] = true;
				}
			}
			
			int count = 0;
			for(int k = n-1; k >= 0; k--){
				answer += x[k] * (Math.pow(10,count));
				if(k != 0){
					if(y[k-1]){
						count += 1;
					}else{
						count = 0;
					}
				}
			}
		}
		System.out.println(answer);
	}
}