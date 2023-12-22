import java.util.*;
public class Main {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		String po=sc.nextLine();
      String p[]=po.split("/",0);
		System.out.println((Integer.parseInt(p[1])<5)?"Heisei":"TBD");
	}
}
