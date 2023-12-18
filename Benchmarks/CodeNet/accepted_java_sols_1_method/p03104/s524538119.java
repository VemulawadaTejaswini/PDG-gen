import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		long a = Long.parseLong(sc.next()) - 1;
		long b = Long.parseLong(sc.next());
		sc.close();
		long zero = (a + 1) / 2 + (b + 1) / 2;
		zero %= 2;
		if(a % 2 == 0) zero ^= a;
		if(b % 2 == 0) zero ^= b;
		ou.print(zero + "\n");
		ou.flush();
    }
}