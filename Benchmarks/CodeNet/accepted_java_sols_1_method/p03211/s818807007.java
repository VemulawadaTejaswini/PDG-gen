import java.util.*;

class Main{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		int x=Math.abs(Integer.parseInt(s.substring(0, 3))-753);
		for(int i=1;i<s.length()-2;++i) {
			if(Math.abs(Integer.parseInt(s.substring(i,i+3))-753)<x) {
				x=Math.abs(Integer.parseInt(s.substring(i,i+3))-753);
			}
		}
			
		

		System.out.println(x);
	}
}
