import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] S = new String[n];
		for(int i=0; i<n; i++){
			S[i]  = sc.next();
		}
		
		for(int i=0; i<n; i++){
			S[i]  = "0" + S[i] +"0";
		}

		String alphabet1 = "abcdefghijklmnopqrstuvwxyz";
		String[] alphabet2 = alphabet1.split("");

		String[] sp;
		int[] min = new int[alphabet2.length];
		int[] count = new int[alphabet2.length];
		for(int j=0; j<alphabet2.length; j++){
			min[j] = 50;
			for(int i=0; i<n; i++){
				sp = S[i].split(alphabet2[j]);
				count[j] = sp.length -1;
				if(min[j]>count[j]){
					min[j] = count[j];
				}
			}
		}
		
		for(int j=0; j<alphabet2.length; j++){
			for(int i=0; i<min[j]; i++){
				System.out.print(alphabet2[j]);
			}
		}
		

	}

}
