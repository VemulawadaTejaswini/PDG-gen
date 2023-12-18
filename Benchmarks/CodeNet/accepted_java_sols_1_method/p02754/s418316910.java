import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		Long a = sc.nextLong();
        Long b = sc.nextLong();
		Long c = sc.nextLong();
		System.out.println(b*(a/(b+c))+Math.min(b,a%(b+c)));
	}
}
