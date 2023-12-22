import java.io.*;
import java.util.*;

public class Main{
	public static void main (String[] args) {
		Scanner cin = new Scanner(System.in);
		int a = cin.nextInt();
		int b = cin.nextInt();
		int cur = 0;
		int cnt = 0;
		while(cur < b) {
		    cnt++;
		    cur += a;
		    if(cur < b) cur--;
		}
		System.out.println(b == 1 ? 0 : cnt);
	}
}