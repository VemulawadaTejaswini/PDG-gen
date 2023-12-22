import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		sc.nextLine();
		String b=sc.nextLine();
		String s = "",S="";
		for(int i=0;i<a/2;i++) {
			s+=b.charAt(i);
		}
		for(int i=a/2;i<a;i++) {
			S+=b.charAt(i);
		}
		String can = s.equals(S)?"Yes":"No";
		System.out.println(can);
	}
}
