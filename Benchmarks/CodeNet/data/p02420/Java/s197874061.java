import java.util.Scanner;

public class Main {
	private static Scanner sc=new Scanner(System.in);
	public static void main (String[] args){
		while(true){
			String order=sc.next();
			if(order.equals("-")) break;
			System.out.println(shuffle(order));
		}
	}
	private static String shuffle(String order){
		int m=sc.nextInt();
		String str=order;
		for(int i=0;i<m;i++){
			int h=sc.nextInt();
			str=str.substring(h)+str.substring(0,h);
		}
		return str;
	}
}