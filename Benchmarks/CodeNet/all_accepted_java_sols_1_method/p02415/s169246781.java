import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int a = s.length();
        for(int i=0; i<a; i++) {
            String s1 = s.substring(i, i +1);
            if(s1.matches("[A-Z]")){
                System.out.print(s1.toLowerCase());
            } else if(s1.matches("[a-z]")) {
                System.out.print(s1.toUpperCase());
            } else {
                System.out.print(s1);
            }
        }
        System.out.println();
    }
}
