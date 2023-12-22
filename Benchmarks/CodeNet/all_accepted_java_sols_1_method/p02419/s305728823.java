import java.util.Scanner;

public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = 0, a, b;
        String w, t;
        w = sc.next().toLowerCase();
        a = w.length();
        while(true){
        	t = sc.next();
        	b = t.length();
        	if(t.contains("END_OF_TEXT")) break;
        	if(a == b) {
        		if(t.toLowerCase().contains(w)) count++;
        	}
        }
        System.out.println(count);
        sc.close();
    }
}
