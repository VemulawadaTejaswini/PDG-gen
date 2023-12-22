import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        var scaner = new Scanner(System.in);
        
        var k = scaner.nextInt();
        var s = scaner.next();

        if (s.length() > k) {
            System.out.println(s.substring(0, k)+"...");
        } else {
            System.out.println(s);
        }

        scaner.close();
    }

}
