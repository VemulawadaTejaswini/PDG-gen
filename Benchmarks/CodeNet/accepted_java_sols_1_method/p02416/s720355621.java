import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s;

        for (s = input.next(); !s.equals("0"); s = input.next()){
            int sum = 0;
            for (char c : s.toCharArray()){
                sum += c - '0';
            }
            System.out.println(sum);
        }
    }
}