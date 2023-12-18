import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String[] line = (sc.next() + sc.next() + sc.next()).split("");
        System.out.println(line[0] + line[4] + line[8]);
    }
}