import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		char[][] a = new char[h][w];
		int c = 0;
		for(int i=0; i<h; i++){
			String s = sc.next();
			for(int j=0; j<w; j++){
				a[i][j] = s.charAt(j);
				if(a[i][j] == '#'){
					c++;
				}
			}
		}
		sc.close();
		
		if(c == h+w-1){
			System.out.println("Possible");
		}else{
			System.out.println("Impossible");
		}

	}

}