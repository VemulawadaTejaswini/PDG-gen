import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		String n = N.substring(N.length() - 1);
		if(n.equals("2") || n.equals("4") || n.equals("5") || n.equals("7") || n.equals("9")){
			System.out.print("hon");
		}else if(n.equals("0") || n.equals("1") || n.equals("6") || n.equals("8")){
			System.out.print("pon");
		}else{
			System.out.print("bon");
		}
	}
}