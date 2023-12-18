import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer x = sc.nextInt();
        Integer y = sc.nextInt();
        Integer group1[] = { 1, 3, 5, 7, 8, 10, 12 };
        Integer group2[] = { 4, 6, 9, 11 };
        Integer group3[] = { 2 };
        if (Arrays.asList(group1).contains(x) && Arrays.asList(group1).contains(y)) {
            System.out.println("Yes");
        } else if (Arrays.asList(group2).contains(x) && Arrays.asList(group2).contains(y)) {
            System.out.println("Yes");

        } else {
            System.out.println("No");
        }
    }
}