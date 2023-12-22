import java.util.*;

class Main {
    private final String defaultN;
    private StringBuilder fixedN;

    Main(String n) {
        this.defaultN = n;
        this.fixedN = new StringBuilder();
    }

    void generateFixedN() {
        for (int i = 0; i < defaultN.length(); i++) {
            fixedN.append(defaultN.charAt(i) == '1' ? '9' : '1');
        }
    }
    
    String getFixedN() {
        return this.fixedN.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        Main m = new Main(n);
        m.generateFixedN();
        System.out.println(m.getFixedN());
    }
}
