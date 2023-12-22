import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i=0;i<b;i++){a-=sc.nextInt();}
		String s = "Yes";
        if(a>0){s = "No";}
		System.out.println(s);
	}
}
