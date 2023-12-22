import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();
        StringBuilder sb = new StringBuilder(s);
        char repl = ' ';
        switch(s.charAt(k-1)){
          case 'A':
            repl = 'a';
            break;
          case 'B':
            repl = 'b';
            break;
          default:
            repl = 'c';
            break;
        }
        sb.setCharAt(k-1, repl);
		System.out.println(sb.toString());
	}
}
