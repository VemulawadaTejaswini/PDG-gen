import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        int b = a;
		String s = sc.next();
        for(int i=1;i<a;i++){if(s.charAt(i)==s.charAt(i-1))
                             {b--;}
                            }
		System.out.println(b);
	}
}
