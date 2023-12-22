import java.util.*;
public class Main {
    Scanner sc = new Scanner(System.in);
    public static void main(String args[]) {
	new Main().doIt();
    }
    void doIt() { B(); }
    void B() {
	int K =	sc.nextInt(), X	= sc.nextInt();
	ArrayList<Integer> ans = new ArrayList<Integer>();
	for(int	i = X-(K-1); i <= X+(K-1); i++) ans.add(i);
        //      System.out.println(ans);                                                         
	for(Integer i: ans) System.out.print(" " + i);
	System.out.println();
    }
    void A() {
        int A = sc.nextInt(), B = sc.nextInt();
	int ans = A+B;
	ans = Math.max(ans, Math.max(A-B, A*B));
	System.out.println(ans);
    }
}
