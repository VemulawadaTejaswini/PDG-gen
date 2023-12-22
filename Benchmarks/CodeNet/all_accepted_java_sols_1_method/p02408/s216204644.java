import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int n = x.nextInt();
		int[] s = new int[13];
		int[] h = new int[13];
		int[] c = new int[13];
		int[] d = new int[13];
		for(int f = 0 ; f < 13 ; f++ ){
			s[f] = 0 ;
			h[f] = 0 ;
			c[f] = 0 ;
			d[f] = 0 ;
		}
		String mk ;
		int su;
		for(int g = 1 ; g <= n ; g++){
			mk = x.next();
			su = x.nextInt();
			if(mk.equals("S")){
				s[su-1] = 1;
			}else if(mk.equals("H")){
				h[su-1] = 1;
			}else if(mk.equals("C")){
				c[su-1] = 1;
			}else if(mk.equals("D")){
				d[su-1] = 1;
			}
		}
			for(int j = 0 ; j < 13 ; j++){
				if(s[j] == 0){
				System.out.println("S"+" "+ (j+1));
				}
			}
			for(int j = 0 ; j < 13 ; j++){
				if(h[j] == 0){
				System.out.println("H"+" "+ (j+1));
				}
			}
			for(int j = 0 ; j < 13 ; j++){
				if(c[j] == 0){
				System.out.println("C"+" "+ (j+1));
				}
			}
			for(int j = 0 ; j < 13 ; j++){
				if(d[j] == 0){
				System.out.println("D"+" "+ (j+1));
				}
			}
	}
}