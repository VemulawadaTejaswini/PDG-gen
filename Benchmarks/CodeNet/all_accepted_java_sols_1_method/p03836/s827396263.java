import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner as = new Scanner(System.in);
		int sx = as.nextInt();
		int sy = as.nextInt();
		int tx = as.nextInt();
		int ty = as.nextInt();
		String l ="";
		for(int i=sy;i<ty;i++){
			l+="U";
		}
		for(int i=sx;i<tx;i++){
			l+="R";
		}
		for(int i=sy;i<ty;i++){
			l+="D";
		}
		for(int i=sx;i<=tx;i++){
			l+="L";
		}
		for(int i=sy;i<=ty;i++){
			l+="U";
		}
		for(int i=sx;i<=tx;i++){
			l+="R";
		}
		l+="DR";
		for(int i=sy;i<=ty;i++){
			l+="D";
		}
		for(int i=sx;i<=tx;i++){
			l+="L";
		}
		l+="U";
		System.out.println(l);
	}
}