import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int h=sc.nextInt();
		int w =sc.nextInt();
		char[][] map=new char[h+2][w+2];
		for(int i=1; i<=h; i++){
			String s=sc.next();
			for(int j=1; j<=w; j++){
				map[i][j]=s.charAt(j-1);
			}
		}
		for(int i=1; i<=h; i++){
			for(int j=1; j<=w; j++){
				if(map[i][j]=='#'){
					if(map[i-1][j]!='#' && map[i+1][j]!='#' && map[i][j-1]!='#' && map[i][j+1]!='#'){
						System.out.println("No");
						return;
					}
				}
			}
		}
		System.out.println("Yes");
	}
}
 