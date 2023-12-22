import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
      	Scanner sc = new Scanner(System.in);
      	int n = Integer.parseInt(sc.next());
      	int x = Integer.parseInt(sc.next());
      	int cnt = 0;
      	int[] a = new int[n];
      	for (int i = 0; i < n; i++) {
          a[i] = Integer.parseInt(sc.next());
        }
      	Arrays.sort(a);
      	for (int i = 0; i < n; i++) {
          	if (i == n - 1) {
              if (x == a[i]) {
              	cnt++;
              }
            } else {
              if (x >= a[i]) {
            	x -= a[i];
              	cnt++;
              }
            }
        }
      	System.out.println(cnt);
    }
}
