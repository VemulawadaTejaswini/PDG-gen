import java.util.Scanner;
public class Main {
@SuppressWarnings("resource")
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	long N=sc.nextLong();
	long dis=1000;
	while(N>0) {
	if(Math.abs(N%1000-753)<dis) {
		dis=Math.abs(N%1000-753);
	}
	N/=10;
	}
	System.out.println(dis);
}
}
