import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String query = sc.next();
        String target;
        int count = 0;
        while (sc.hasNext()) {
            target = sc.next().toLowerCase();
            if (target.equals("END_OF_TEXT")) break;
            if (target.equals(query)) count++;
        }
        System.out.println(count);
    }
}
