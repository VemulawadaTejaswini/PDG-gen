import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            c = (char)(((c-65)+n)%26+65);
            sb.append(c);
        }
        System.out.println(sb.toString());
    }
}