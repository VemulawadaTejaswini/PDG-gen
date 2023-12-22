import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);		
		int a = sc.nextInt();
        if (a%2==0){System.out.println("0.5");}
        else{double ans = (a+1.0)/(2.0*a);
             System.out.println(ans);}
	}
}
