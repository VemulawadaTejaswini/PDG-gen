import java.util.*;

public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        double n = (double)sc.nextInt();
        double c = Math.ceil(n/1000)*1000;
        int x = (int)c - (int)n;
        System.out.println(x);

    }
}
