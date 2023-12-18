
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int n = sc.nextInt();
    static ArrayList<Integer> s = new ArrayList<Integer>();
    static ArrayList<Integer> h = new ArrayList<Integer>();
    static ArrayList<Integer> c = new ArrayList<Integer>();
    static ArrayList<Integer> d = new ArrayList<Integer>();


    public static void main(String[] args) {
        for (int i = 1; i <= 13; i++){
            s.add(i);
            h.add(i);
            c.add(i);
            d.add(i);
        }
        for (int i = 0; i < n; i++){
            String str = sc.next();
            int num = sc.nextInt();
            if (str.equals("S"))
                s.remove(s.indexOf(num));
            else if (str.equals("H"))
                h.remove(h.indexOf(num));
            else if (str.equals("C"))
                c.remove(c.indexOf(num));
            else if (str.equals("D"))
                d.remove(d.indexOf(num));
        }
        for (int ss : s)
            System.out.println("S " + ss);
        for (int hh : h)
            System.out.println("H " + hh);
        for (int cc : c)
            System.out.println("C " + cc);
        for (int dd : d)
            System.out.println("D " + dd);
    }
}

