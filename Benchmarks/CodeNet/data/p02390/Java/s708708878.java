import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner i =new Scanner(System.in);
		int r = i.nextInt();
		
		int h =Math.round(r/(60*60));
		int m =Math.round(r%(60*60)/60);
		int s =Math.round(r%(60*60)%60);
		System.out.println(h+":"+m+":"+s);
	}
}