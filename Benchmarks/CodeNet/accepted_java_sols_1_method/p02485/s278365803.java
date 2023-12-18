import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		ArrayList<Integer> result=new ArrayList<Integer>();
		String s="";
		int sum=0;
		while (in.hasNext()) {
			s=in.next();
			for (int i=0;i<s.length();i++) {
				sum+=(int)(s.charAt(i))-(int)'0';
			}
			if (sum==0) {
				break;
			}
			result.add(sum);
			sum=0;
		}
		for (int i=0;i<result.size();i++) {
			System.out.printf("%d%n",result.get(i));
		}
	}
}