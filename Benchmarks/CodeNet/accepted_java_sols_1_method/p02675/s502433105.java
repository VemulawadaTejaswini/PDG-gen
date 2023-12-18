import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		char[] n = stdIn.next().toCharArray();
		
		
		if(n[n.length-1]=='2' || n[n.length-1]=='4'|| n[n.length-1]=='5' || n[n.length-1]=='7' || n[n.length-1]=='9') {
			System.out.println("hon");
		}else if(n[n.length-1]=='0'||n[n.length-1]=='1'||n[n.length-1]=='6'||n[n.length-1]=='8') {
			System.out.println("pon");
		}else {
			System.out.println("bon");
		}
		
		
		
		
	}

}
