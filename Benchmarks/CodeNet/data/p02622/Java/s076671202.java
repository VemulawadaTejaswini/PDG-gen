import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		String s=scn.next();
		 String t =scn.next();
		 long count=0;
		 for(int i=0;i<s.length();i++){
			 if(s.charAt(i)!=t.charAt(i)){
				 count++;
			 }
		 }
		 System.out.println(count);

	}

}