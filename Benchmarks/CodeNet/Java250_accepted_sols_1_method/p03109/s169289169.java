import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String[] a = sc.next().split("/", 0);;
		System.out.println(Integer.parseInt(a[1])*100+Integer.parseInt(a[2])<=430?"Heisei":"TBD");
	}
}