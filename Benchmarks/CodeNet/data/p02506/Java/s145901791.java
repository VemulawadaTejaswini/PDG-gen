import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String w = input.next().toLowerCase();
        int cnt = 0;

        while (true){
            String t = input.next().toLowerCase().replaceAll("[\".,]", "");

            if (t.equals("end_of_text")) break;
            if (w.equals(t)) cnt++;
        }
        System.out.println(cnt);
    }
}