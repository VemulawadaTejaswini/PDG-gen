import java.util.*;
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int x;
		int y;
		while ((x=sc.nextInt())!=0&&(y=sc.nextInt())!=0){
			if (x<y){
				System.out.print(x+" "+y+"\n");
			} else {
				System.out.print(y+" "+x+"\n");
			}
		}
	}
}