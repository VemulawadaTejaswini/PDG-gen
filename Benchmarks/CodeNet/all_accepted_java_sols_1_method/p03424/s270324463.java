//package Contest089;

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        TreeSet<Character> ts = new TreeSet<>();
        int n  = Integer.valueOf(sc.nextLine());
        for(int i=0;i<n;i++)
            ts.add(sc.next().charAt(0));

        if(ts.size()==3)
            out.println("Three");
        else
            out.println("Four");

        out.flush();
    }
}
