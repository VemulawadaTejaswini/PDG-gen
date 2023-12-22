import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        
        int xx = x2 - x1;
        int yy = y2 - y1;
        
        int x3 = x2 - yy;
        int x4 = x1 - yy;
        int y3 = y2 + xx;
        int y4 = y1 + xx;
        
        System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
	}
}