import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String H = "H";
        String D = "D";
        if(a.equals(H)){
        	if(b.equals(H)) System.out.println("H");
        	else if(b.equals(D)) System.out.println("D");
        }else if(a.equals(D)){
        	if(b.equals(H)) System.out.println("D");
        	else if(b.equals(D)) System.out.println("H");
        }
	}

}
