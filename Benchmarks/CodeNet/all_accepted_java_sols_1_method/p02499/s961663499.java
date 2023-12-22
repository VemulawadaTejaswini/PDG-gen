import java.io.*;
import java.util.Scanner;

class Main {
	public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        String str = new String();
        int[] counter = new int[26];
        
        while (in.hasNext()) {
            str = in.next();
            for (int i=0; i<str.length(); i++) {
                int num =Character.toLowerCase(str.charAt(i)) - 'a';
                
                if (0<=num && num<=25)
                    counter[num]++;
            }
        }
        
        char c = 'a';
        for(int i=0; i<26; i++) {
            System.out.println(c + " : " + counter[i]);
            c++;
        }
	}
}