import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        LinkedList<Character> display = new LinkedList<>();
        
        for(int i=0;i<s.length();i++){
        	if(s.charAt(i)=='B') display.pollLast();
        	else display.addLast(s.charAt(i));
        }
        for(char c:display) System.out.print(c);
        System.out.println();
    }
}