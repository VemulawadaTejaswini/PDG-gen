    import java.util.*;
    class Main
    {
    	public static void main(String[] args) {
    		Scanner s = new Scanner(System.in);
    		int x = s.nextInt();int a = s.nextInt();int b = s.nextInt();
    		int ans = (x-a);
    		if(ans >= b)
    			ans = ans%b;
    		System.out.println(ans);
    	}
    }