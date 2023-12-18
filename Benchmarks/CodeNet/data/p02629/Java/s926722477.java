import java.util.Scanner;
        
public class Main {
    public static String naming(int x) {
        String alp = "";
        if (x == 1) {
            alp = "a";
        } else if (x == 2) {
            alp = "b";
        } else if (x == 3) {
            alp = "c";
        } else if (x == 4) {
            alp = "d";
        } else if (x == 5) {
            alp = "e";
        } else if (x == 6) {
            alp = "f";
        } else if (x == 7) {
            alp = "g";
        } else if (x == 8) {
            alp = "h";
        } else if (x == 9) {
            alp = "i";
        } else if (x == 10) {
            alp = "j";
        } else if (x == 11) {
            alp = "k";
        } else if (x == 12) {
            alp = "l";
        } else if (x == 13) {
            alp = "m";
        } else if (x == 14) {
            alp = "n";
        } else if (x == 15) {
            alp = "o";
        } else if (x == 16) {
            alp = "p";
        } else if (x == 17) {
            alp = "q";
        } else if (x == 18) {
            alp = "r";
        } else if (x == 19) {
            alp = "s";
        } else if (x == 20) {
            alp = "t";
        } else if (x == 21) {
            alp = "u";
        } else if (x == 22) {
            alp = "v";
        } else if (x == 23) {
            alp = "w";
        } else if (x == 24) {
            alp = "x";
        } else if (x == 25) {
            alp = "y";
        } else if (x == 26) {
            alp = "z";
        }
        return alp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long n = Long.parseLong(sc.nextLine());
        StringBuilder answer = new StringBuilder();
        long temp = n;

        while (temp != 0) {
            answer.insert(0, naming((int)(temp % 26)));
            temp = temp / 26;
        }

        System.out.println(answer);

    }
}