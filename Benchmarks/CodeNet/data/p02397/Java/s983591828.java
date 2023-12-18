import java.util.*;
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int x;
		int y;
		while ((x=sc.nextInt())!=0&&(y=sc.nextInt())!=0){
			if (x<y){
				System.out.println(x+" "+y);
			} else {
				System.out.println(y+" "+x);
			}
		}
	}
}