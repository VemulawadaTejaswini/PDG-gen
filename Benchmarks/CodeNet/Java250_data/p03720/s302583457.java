import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m =	Integer.parseInt(sc.next());
	int[] a	= new int[n+1];
	for(int i = 0; i<m; i++) {
            a[Integer.parseInt(sc.next())]++;
            a[Integer.parseInt(sc.next())]++;
        }
	for(int i = 1; i<n+1; i++) {
            System.out.println(a[i]);
        }
    }
}