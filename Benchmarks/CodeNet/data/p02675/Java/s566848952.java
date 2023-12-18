import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        do_(inp);
        inp.close();
    }
    public static void do_(Scanner inp) {
        char ss[] = inp.next().toCharArray();
        char s = ss[ss.length - 1];
        if (s == '2' || s == '4' || s == '5' || s == '7' || s == '9') {
            System.out.println("hon");
        }
        else if (s == '0' || s == '1' || s == '6' || s == '8') {
            System.out.println("pon");
        }
        else {
            System.out.println("bon");
        }
    }
}
