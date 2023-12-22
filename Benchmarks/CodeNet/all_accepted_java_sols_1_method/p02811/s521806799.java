import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String s = "Yes";
        int b = sc.nextInt();
		int c = 0;
        if(a*500<b){s = "No";}
		System.out.println(s);
	}
}