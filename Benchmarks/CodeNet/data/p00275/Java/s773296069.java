import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String t[] = new String[100];
		while(n != 0){
			String M = scan.next();
			for(int i = 0 ; i < 100 ; i++){
				t[i] = String.valueOf(M.charAt(i));
			}
			int k[] = new int[n];
			int S = 0;
			int cou = 0;
			for(int i = 0 ; i < 100 ; i++){
				for(int j = 0 ; j < n ; j++){
					if(cou == j){
						if(t[i].equals("M")){
							++k[j];
						}else if(t[i].equals("S")){
							S = S + k[j] + 1;
							k[j] = 0;
						}else{
							k[j] = k[j]+1+S;
							S = 0;
						}
						if(cou == n-1){
							cou = 0;
						}else{
							++cou;
						}
						break;
					}
				}
			}
			int T = 0;
			for(int i = 0; i < n ; i++){
				for(int j = i+1; j < n ;j++){
					if(k[i] > k[j]){
						T = k[i];
						k[i] = k[j];
						k[j] = T;
					}
				}
			}
			for(int i = 0 ; i < n ; i++){
				System.out.print(k[i] + " ");
			}
			System.out.println(S);
			n = scan.nextInt();
		}
	}
}