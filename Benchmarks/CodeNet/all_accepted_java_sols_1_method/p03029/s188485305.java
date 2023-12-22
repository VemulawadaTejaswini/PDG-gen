import java.util.*;

public class Main{
	public static void main(String[] args){
    	Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int p = s.nextInt();
        System.out.println((int) Math.floor((a*3+p)/2));
    }
}