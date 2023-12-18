import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String w = input.next();
        int cnt = 0;

        while (true){
            String t = input.next();

            if (t.equals("END_OF_TEXT")) break;
            if (w.equalsIgnoreCase(t)) cnt++;
        }
        System.out.println(cnt);
    }
}