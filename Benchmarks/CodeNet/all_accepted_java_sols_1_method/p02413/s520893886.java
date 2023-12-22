import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int r = scan.nextInt();
		int c = scan.nextInt();
		int k[] = new int[(r+1)*(c+1)];
		for(int a = 0;a<r*c;a++){
			k[a] = scan.nextInt();
		}
		int kaunto = 0;
		int tate = 0;
		int tateR = 0;
		for(int b = 0;b<r;b++){
			int yoko = 0;
			for(int d = 0;d<(c+1);d++){
				if(d != c){
					System.out.print(k[kaunto] + " ");
					yoko = yoko + k[kaunto];
					++kaunto;
				}else{
					System.out.println(yoko);
					tateR = tateR + yoko;
				}
			}
		}
		for(int e = 0;e<(c+1);e++){
			if(e != c){
				for(int f = 0;f<r*c;f++){
					if(f % c == e){
						tate = tate + k[f];
					}
				}
				System.out.print(tate + " ");
				tate = 0;
			}else{
				System.out.println(tateR);
			}
		}
	}
}