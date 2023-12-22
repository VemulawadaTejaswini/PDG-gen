import java.util.*;

class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in); 
		String s=sc.next();
		int i=0;
		while(i<3){
		    if(s.charAt(i)=='1')
		        System.out.print("9");
		    else
		        System.out.print("1");
		  i++;
		}
	}
}