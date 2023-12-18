import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int total;
		String x;
		while(true){
			x = sc.next();
			if(x.equals("0")) break;
			total = 0;
			for(int i=0;i<x.length();i++){
				total += Integer.valueOf(x.charAt(i))-48;
			}
			System.out.println(total);
		}
	}
}