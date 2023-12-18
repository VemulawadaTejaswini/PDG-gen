import java.util.*;
public class Main {
	static String input = new String();
	static char[] hyou = {'I','V','X','L','C','D','M'};
	static int[] hyou2 = {1,5,10,50,100,500,1000};
	static int search(char a){
		for(int i=0;i<7;i++)if(a==hyou[i])return hyou2[i];
		return 0;
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			input = in.next();
			int result = 0;
			for(int s=0;s<input.length()-1;s++){
				int next=search(input.charAt(s+1));
				int now=search(input.charAt(s));
				if(next>now)result-=now;
				else result+=now;
			}
			result+=search(input.charAt(input.length()-1));
			System.out.println(result);
		}
	}
}