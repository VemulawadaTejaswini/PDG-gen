import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        char[] vowels = new char[]{'a','i','u','e','o'};
        for(char v:vowels) if(c==v){
        	System.out.println("vowel");
        	return;
        }
        System.out.println("consonant");
        
    }
}
