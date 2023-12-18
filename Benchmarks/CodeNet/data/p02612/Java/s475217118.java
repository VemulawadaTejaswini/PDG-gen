import java.util.*;
class Main{
	public static void main(){
    	Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int pay= (int)Math.ceil(N/1000);
        int change = pay-N;
        System.out.println(change);
     
    }
}