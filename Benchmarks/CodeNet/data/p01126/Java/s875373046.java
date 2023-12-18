
import java.io.PrintWriter;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter pr = new PrintWriter(System.out);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a = sc.nextInt();
		int [][] map = new int[1001][n+2];
		while(m-->0){
			int h = sc.nextInt();
			map[h][Math.min(sc.nextInt(), sc.nextInt())] = 1;
		}
		int h = 1000;
		while(h-->0){
			if(map[h][a]==1){
				a++;
			}else if(map[h][a-1]==1){
				a--;
			}
		}
		pr.println(a);
		pr.flush();
		sc.close();
	}
}