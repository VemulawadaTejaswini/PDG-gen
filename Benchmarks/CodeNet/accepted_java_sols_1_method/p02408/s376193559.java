import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int S[] = {0,0,0,0,0,0,0,0,0,0,0,0,0};
		int H[] = {0,0,0,0,0,0,0,0,0,0,0,0,0};
		int C[] = {0,0,0,0,0,0,0,0,0,0,0,0,0};
		int D[] = {0,0,0,0,0,0,0,0,0,0,0,0,0};
		String[] m = new String[n];
		int[] s = new int[n];
		for(int a =0;a<n;a++){
			m[a] = scan.next();
			s[a] = scan.nextInt();
		}
		for(int b = 0;b<n;b++){
			if(m[b].equals("S")){
				for(int c = 1;c<=13;c++){
					if(s[b] == c){
						S[c-1] = 1;
						break;
					}
				}
			}else if(m[b].equals("H")){
				for(int c = 1;c<=13;c++){
					if(s[b] == c){
						H[c-1] = 1;
						break;
					}
				}
			}else if(m[b].equals("C")){
				for(int c = 1;c<=13;c++){
					if(s[b] == c){
						C[c-1] = 1;
						break;
					}
				}
			}else if(m[b].equals("D")){
				for(int c = 1;c<=13;c++){
					if(s[b] == c){
						D[c-1] = 1;
						break;
					}
				}
			}
		}
		for(int e = 0;e<13;e++){
			if(S[e] == 0){
				System.out.println("S "+(e+1));
			}
		}
		for(int f = 0;f<13;f++){
			if(H[f] == 0){
				System.out.println("H "+(f+1));
			}
		}
		for(int g = 0;g<13;g++){
			if(C[g] == 0){
				System.out.println("C "+(g+1));
			}
		}
		for(int h = 0;h<13;h++){
			if(D[h] == 0){
				System.out.println("D "+(h+1));
			}
		}
	}
}