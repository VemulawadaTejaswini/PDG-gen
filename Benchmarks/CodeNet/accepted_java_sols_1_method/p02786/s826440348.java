import java.util.Scanner;
public class Main {
@SuppressWarnings("resource")
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	long H=sc.nextLong();
	long bunnum=0;
	while(H>1) {
		H/=2;
		bunnum++;
	}
	long play=(long) Math.pow(2, bunnum);
	System.out.println(2*play-1);


}
}