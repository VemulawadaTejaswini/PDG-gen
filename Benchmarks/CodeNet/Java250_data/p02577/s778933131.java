
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		char c[]=ob.next().toCharArray();
		int sum=0;
		for(int i=0;i<c.length;i++){
		sum=sum+Character.getNumericValue(c[i]);
		}
		if(sum%9==0){System.out.println("Yes");}
		else{System.out.println("No");}
	}
}
