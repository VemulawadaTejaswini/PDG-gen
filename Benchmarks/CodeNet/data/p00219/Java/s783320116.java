
import java.util.Scanner;



public class Main {
	public static void main(String[] args){
		Scanner sn = new Scanner(System.in);
		int n;
		while( (n=sn.nextInt()) != 0){
			int[] ices = new int[10];
			for(int i = 0; i < 10; i++) ices[i] = 0;
			for(int i = 0; i < n; i++) ices[sn.nextInt()]++;
			for(int i = 0; i < 10; i++) System.out.println(meter(ices[i]));
		}
	}
	static String meter(int n){
		if(n == 0) return "-";
		String out = "";
		for(int i = 0; i < n; i++) out+="*";
		return out;
	}
}