import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
	Scanner scan = new Scanner(System.in);
	Integer x = scan.nextInt();
	Integer y = scan.nextInt();
	Integer z = scan.nextInt();	
	
	if(x>z){
		Integer tmp = x;
		x = z;
		z = tmp;
	}
	if(x>y){
		Integer tmp = x;
		x = y;
		y = tmp;
	}
	if(y>z){
		Integer tmp = z;
		z = y;
		y = tmp;
	}
	
	System.out.println(x+" "+y+" "+z);
	
	}
}