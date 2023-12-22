
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      String[] nyu=sc.nextLine().split(" ");
   //  String nyu=sc.nextLine();

int A=Integer.parseInt(nyu[0]);
int B=Integer.parseInt(nyu[1]);

if(A>12){
System.out.println(B);
}else if(5<A && A<13){
System.out.println(B/2);
}else if(6>A){
System.out.println("0");
}
	}
}