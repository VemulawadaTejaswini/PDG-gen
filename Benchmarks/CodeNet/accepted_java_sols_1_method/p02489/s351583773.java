import java.io.*;
import java.util.*;
class Main{
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		while(true){
			cnt++;
			int x = sc.nextInt();
			if(x == 0)break;
			System.out.println("Case "+cnt+": "+x);
		}
	}
}