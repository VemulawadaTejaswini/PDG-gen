import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int r = sc.nextInt();
		int d = sc.nextInt();
		int count = 0;
		for(int i = 1; i < 100; i++){
			if((d * i >= l) && (d * i <= r))
			count++;
		}
		System.out.println(count);
    }
}