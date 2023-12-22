import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String w = sc.nextLine();
        int count = 0;
        String t;
        while (!((t = sc.next()).equals("END_OF_TEXT"))) {
            if(t.toLowerCase().equals(w))
                count++;
        }
        System.out.println(count);
    }
}
