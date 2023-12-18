import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        int b = sc.nextInt();
		int c = Math.max(a-b,b-a);
        if(c%2==0){System.out.println(Math.max(a,b)-c/2);}
		else{System.out.println("IMPOSSIBLE");}
	}
}
