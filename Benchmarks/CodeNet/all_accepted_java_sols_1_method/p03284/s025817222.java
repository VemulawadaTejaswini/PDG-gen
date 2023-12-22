import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int k = input.nextInt();
		if(n%k==0){System.out.println("0");}
		else{System.out.println("1");}
	}
}