import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    public void run() {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();

        int idx1 = 0; 
        for (int i = 0; i < s.length; i++) {
            if (s[i] == 'A') {
                idx1 = i;
                break;
            }
        }

        int idx2 = 0; 
        for (int i = s.length - 1; i >= 0; i--) {
            if (s[i] == 'Z') {
                idx2 = i;
                break;
            }
        }
        
        System.out.println(idx2 - idx1 + 1);

        return;
    }

}