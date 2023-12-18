import java.util.Scanner;

class Main {
    
    static final char[] ALPHA = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    static final long BASE = 26;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        String name = "";
        while (n != 0) {
            long rem = n % BASE;
            name = ALPHA[(int) (rem-1)] + name;
            n /= BASE;
        }
        System.out.println(name);
    }
}
