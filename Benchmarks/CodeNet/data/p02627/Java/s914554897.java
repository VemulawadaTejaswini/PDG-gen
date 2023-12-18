import java.util.*;
class alphbet{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		if(Character.isUpperCase(in.next().charAt(0)))
			System.out.println('A');
		else
			System.out.println('a');
	}
}