import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        TreeSet <Integer> s = new TreeSet<Integer>();
        s.add(a);
        s.add(b);
        s.add(c);

        StringBuilder ret = new StringBuilder();
        for (Iterator<Integer> iterator = s.iterator(); iterator.hasNext();) {
        	ret.append(" ");
			ret.append(iterator.next());
		}
        System.out.println(ret.delete(0, 1).toString());
    }
}