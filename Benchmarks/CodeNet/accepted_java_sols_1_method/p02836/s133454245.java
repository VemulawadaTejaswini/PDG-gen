import java.util.Scanner;
public class Main{
@SuppressWarnings("resource")
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	String N=sc.next();
	String N2[]=N.split("");
	int ans=0;
	for(int i=0;i<N2.length/2;i++) {
		if(!N2[i].equals(N2[N2.length-1-i])) {
			ans++;
		}
	}
	System.out.println(ans);
}
}