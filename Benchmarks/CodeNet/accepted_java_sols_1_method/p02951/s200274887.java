import java.util.*;
public class Main{
	public static void main(String sp[]){
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();
int diff = a-b;
int hold=c-(Math.min(diff,c));
System.out.println(hold);
}
}
