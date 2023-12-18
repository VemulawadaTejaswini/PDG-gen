import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int A =Integer.parseInt(in.next());
		int B =Integer.parseInt(in.next());
		int C =Integer.parseInt(in.next());
		int D =Integer.parseInt(in.next());
		if(A+B>C+D)System.out.println("Left");
		else if(A+B<C+D)System.out.println("Right");
		else System.out.println("Balanced");
	}
}