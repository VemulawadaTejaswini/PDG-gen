import java.util.*;
public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        Object[] result = Arrays.stream(a.split(""))
        						.filter(s->s.equals("1"))
        						.toArray();
        System.out.println(result.length);
	}
}