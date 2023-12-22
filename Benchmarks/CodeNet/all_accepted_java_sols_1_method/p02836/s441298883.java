import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		int change = 0;
		String s = scan.next();
		for(int i=0;i<s.length()/2;i++){
			if(!(s.charAt(i)==s.charAt(s.length()-1-i))){
				change++;
			}

		}
		System.out.println(change);
	}
}