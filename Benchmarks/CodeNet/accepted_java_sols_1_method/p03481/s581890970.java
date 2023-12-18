import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	long X = Long.parseLong(sc.next());
	long Y = Long.parseLong(sc.next());
	long ans = 0;
	long tmp = X;
        while(tmp<=Y) {
            ans++;
            tmp	*= 2;
        }
	System.out.println(ans);
    }
}