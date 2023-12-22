import java.util.*;
public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String s = sc.next();
        boolean flag = true;

        for(int i=0; i<a; i++){
            if(s.charAt(i)=='-') flag =false;
        }
        if(s.charAt(a)!= '-') flag = false;

        for(int i=a+1; i<s.length(); i++){
            if(s.charAt(i)=='-') flag = false;
        }
        if(flag) System.out.println("Yes");
        else System.out.println("No");
    }
}