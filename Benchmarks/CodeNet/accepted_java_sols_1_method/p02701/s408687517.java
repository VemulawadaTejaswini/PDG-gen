import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        String s[] = new String[n];
        HashSet<String> set = new HashSet<String>();
        for(int i=0;i<n;i++) {
        	s[i] = sc.next();
        	set.add(s[i]);
        }
        System.out.println(set.size());
    }
}