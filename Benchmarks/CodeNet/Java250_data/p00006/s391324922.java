import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		String str=input.next();
		char[] reverse=str.toCharArray();
		for(int i=reverse.length-1;i>=0;i--){
			System.out.print(reverse[i]);
		}
		System.out.println();
		
	}

}