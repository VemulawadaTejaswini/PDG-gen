import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        String S = sc.next();
        StringBuilder sb = new StringBuilder();
		for (int i = 0; i < S.length(); i++) {
			sb.append("x");
		}
		System.out.println(sb.toString());
    }
}
