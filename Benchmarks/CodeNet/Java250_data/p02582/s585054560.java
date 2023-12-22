import java.util.Scanner;
import java.lang.Math;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		int totalRainy = getConcRainy(str);
		System.out.println(totalRainy);
	}


	public static int getConcRainy(String str){
		int total = 0;
		int max = 0;
		if(str.charAt(0) == 'R'){
			total++;
			max = Math.max(max, total);
		}

		for(int i = 1; i < str.length(); i++){
			if(str.charAt(i - 1) == str.charAt(i) && 
				       str.charAt(i) == 'R'){
			  total++;
			  max = Math.max(total, max);
			} else if(str.charAt(i) == 'R'){
				total = 1;
				max = Math.max(total, max);
			} else {
				total = 0;
			}
		}

		return max;
	}
}
