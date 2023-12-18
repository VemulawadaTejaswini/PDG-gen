import java.util.*;
class Main{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		String indata;
		indata = s.next();
		int wide = Integer.parseInt(indata);
		indata = s.next();
		int hight = Integer.parseInt(indata);
		indata = s.next();
		int x = Integer.parseInt(indata);
		indata = s.next();
		int y = Integer.parseInt(indata);
		indata = s.next();
		int r = Integer.parseInt(indata);
		
		if(x>r&&y>r&&(wide-x)>r&&(hight-y)>r)System.out.println("Yes");
		else System.out.println("No");
		
				
	}
}