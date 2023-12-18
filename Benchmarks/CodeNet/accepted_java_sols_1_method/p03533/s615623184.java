import java.util.*;
class Main{
	public static void main(String[]$){
		Scanner s=new Scanner(System.in);
		System.out.println(s.next().matches("AKIHABARA".replaceAll("A","A?"))?"YES":"NO");
	}
}