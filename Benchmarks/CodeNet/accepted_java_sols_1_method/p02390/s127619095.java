import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
int c = a/3600;
int d = a-3600*c;
int e = d/60;
int f = d-60*e;
		System.out.println(c+":"+e+":"+f);
	}
}
