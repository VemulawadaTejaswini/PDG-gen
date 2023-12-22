import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int cont1 = 0, cont2 = 0;
		int n1 = scn.nextInt();
		if(n1==5)cont1++;
		else if(n1==7)cont2++;
		 n1 = scn.nextInt();
		if(n1==5)cont1++;
		else if(n1==7)cont2++;
		n1 = scn.nextInt();
		if(n1==5)cont1++;
		else if(n1==7)cont2++;
		if(cont1==2&cont2==1)System.out.println("YES");
		else System.out.println("NO");
		scn.close();
	}
}