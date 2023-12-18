import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        var scaner = new Scanner(System.in);
        
        String ans;

        var a = scaner.next();
        if (Character.isUpperCase(a.toCharArray()[0])) {
            ans = "A";
        } else {
            ans = "a";
        }

        System.out.println(ans);

        scaner.close();
    }

}
