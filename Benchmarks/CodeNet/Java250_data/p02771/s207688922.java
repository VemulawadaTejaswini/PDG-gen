import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		String s = "No";
        int b = sc.nextInt();
		int c = sc.nextInt();
        if((a-b)*(b-c)*(c-a)==0 && (a!=b || b!=c || c!=a)){s = "Yes";}
		System.out.println(s);
	}
}
