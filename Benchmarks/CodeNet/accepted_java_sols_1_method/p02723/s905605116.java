import java.util.*;
import java.math.*;

class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        String a = N.substring(2,3);
        String b = N.substring(3,4);
        String c = N.substring(4,5);
        String d = N.substring(5);
        if(a.equals(b) && c.equals(d)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
	}

}