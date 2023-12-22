import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        String cha = sc.next();

        int numA = cha.indexOf('A');
        int numZ = cha.lastIndexOf('Z');
        
        int ans = numZ - numA + 1;

        System.out.println(ans);
	}
}