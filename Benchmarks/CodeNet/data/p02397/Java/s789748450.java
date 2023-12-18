import java.util.*;
import java.lang.*;
public class Main {
	public static void main(String[] args) throws Exceptions{
		Scanner sc = new Scanner(System.in);
		int x;
		int y;
		StringBuilder sb = new StringBuilder();
		while ((x=sc.nextInt())!=0&&(y=sc.nextInt())!=0){
			if (x<y){
				sb.append(x+" "+y+"\n");
			} else {
				sb.append(y+" "+x+"\n");
			}
		}
		System.out.print(sb);
	}
}