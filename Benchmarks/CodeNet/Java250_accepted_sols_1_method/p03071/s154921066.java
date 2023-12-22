
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      String[] nyu=sc.nextLine().split(" ");
   //  String nyu=sc.nextLine();

int A=Integer.parseInt(nyu[0]);
int B=Integer.parseInt(nyu[1]);

if(A>B){
System.out.println(A+A-1);

}else if(A<B){
System.out.println(B+B-1);

}else{
System.out.println(B+A);

}




	}
}