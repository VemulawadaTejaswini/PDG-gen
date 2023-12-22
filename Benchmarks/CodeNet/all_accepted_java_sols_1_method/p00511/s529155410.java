import java.util.Scanner;


public class Main {
	public static void main(String[] artgs){
		Scanner sn = new Scanner(System.in);
		int before = sn.nextInt();
		while(true){
			String op = sn.next();
			if(op.equals("=")) break;
			int after = sn.nextInt();
			if(op.equals("+")){
				before += after;
			} else  if(op.equals("-")){
				before -= after;
			}else  if(op.equals("*")){
				before *= after;
			}else  if(op.equals("/")){
				before /= after;
			}
		}
		System.out.println(before);
	}
}