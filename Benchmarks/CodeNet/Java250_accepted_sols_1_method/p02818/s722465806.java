import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Long a = sc.nextLong();
        Long b = sc.nextLong();
		Long c = sc.nextLong();
        if(a<c){b=Math.max(0,a+b-c);}
        a=Math.max(0,a-c);       
		System.out.println(a + " " + b);
	}
}
