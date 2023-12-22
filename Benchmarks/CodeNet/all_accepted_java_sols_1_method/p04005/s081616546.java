import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        long a = sc.nextLong(),b=sc.nextLong(),c=sc.nextLong();
        System.out.println(a%2+b%2+c%2==3?Math.min(Math.min(a*b,b*c),c*a):0);
    }
}
