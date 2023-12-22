import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String target = sc.nextLine();
        String queryIn = sc.nextLine();
        CharSequence query = queryIn.subSequence(0, queryIn.length());
        String ring = target.concat(target);
        if (ring.contains(query)) System.out.println("Yes");
        else System.out.println("No");
    }
}
