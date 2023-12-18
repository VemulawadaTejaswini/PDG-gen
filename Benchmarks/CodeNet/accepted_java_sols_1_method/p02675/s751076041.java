import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str=sc.next();
		
		if(str.endsWith("2")||
		str.endsWith("4")||
		str.endsWith("5")||
		str.endsWith("7")||
		str.endsWith("9")
		){
			System.out.println("hon");
		}
		else if(str.endsWith("0")||
		str.endsWith("1")||
		str.endsWith("6")||
		str.endsWith("8")
		){	System.out.println("pon");
		}
		else{
			System.out.println("bon");
		}
	}
}
