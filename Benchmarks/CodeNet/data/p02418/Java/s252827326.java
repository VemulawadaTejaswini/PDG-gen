import java.util.Scanner;

public class Aim {

	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i;
        int j = 0, e = 0;
        String s = sc.next();
        s = s.concat(s);
        String p = sc.next();
        if(s.contains(p))System.out.println("Yes");
        else System.out.println("No");
        sc.close();
    }
}
