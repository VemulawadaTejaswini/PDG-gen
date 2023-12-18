import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String bus = scanner.next();
		
		if(bus.equals("AAA") || bus.equals("BBB")){
        	System.out.println("No");
        }else{
        	System.out.println("Yes");
        }
    }
}