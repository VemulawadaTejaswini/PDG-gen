import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		int[] a = new int[4];
		for(int i=0; i<4; i++){
			a[i] = Character.getNumericValue(n.charAt(i));
		}
		String t = "=7";
		if(a[0]+a[1]+a[2]+a[3]==7)t = a[0] + "+" + a[1] + "+" + a[2] + "+" + a[3] + t;
		else if(a[0]+a[1]+a[2]-a[3]==7)t = a[0] + "+" + a[1] + "+" + a[2] + "-" + a[3] + t;
		else if(a[0]+a[1]-a[2]+a[3]==7)t = a[0] + "+" + a[1] + "-" + a[2] + "+" + a[3] + t;
		else if(a[0]-a[1]+a[2]+a[3]==7)t = a[0] + "-" + a[1] + "+" + a[2] + "+" + a[3] + t;
		else if(a[0]+a[1]-a[2]-a[3]==7)t = a[0] + "+" + a[1] + "-" + a[2] + "-" + a[3] + t;
		else if(a[0]-a[1]+a[2]-a[3]==7)t = a[0] + "-" + a[1] + "+" + a[2] + "-" + a[3] + t;
		else if(a[0]-a[1]-a[2]+a[3]==7)t = a[0] + "-" + a[1] + "-" + a[2] + "+" + a[3] + t;
		else if(a[0]-a[1]-a[2]-a[3]==7)t = a[0] + "-" + a[1] + "-" + a[2] + "-" + a[3] + t;
		System.out.println(t);
	}
}