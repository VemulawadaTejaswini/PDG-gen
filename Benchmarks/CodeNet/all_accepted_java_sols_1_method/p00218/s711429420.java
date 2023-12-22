import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] S = new String[10000];
		int EM,EMJ,n;
		while((n = sc.nextInt()) != 0){
			for(int i = 0; i < n; i++){
				int pm = sc.nextInt();
				int pe = sc.nextInt();
				int pj = sc.nextInt();
				EM = (pm + pe) / 2;
				EMJ = (pm + pe + pj) / 3;
				if((pm == 100 || pe == 100 || pj == 100) || EM >= 90 || EMJ >= 80){
					S[i] = "A";
				}else{
					if(EMJ >= 70 || (EMJ >= 50 && (pm >= 80 || pe >= 80))){
						S[i] = "B";
					}
					else{
						S[i] = "C";
					}
				}
			}
			for(int k = 0; k < n; k++){
				System.out.println(S[k]);
			}
		}
	}
}