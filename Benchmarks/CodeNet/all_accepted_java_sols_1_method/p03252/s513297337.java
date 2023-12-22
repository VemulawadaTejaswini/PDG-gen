public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String args[]) {
        String s = scanner.next();
        String t = scanner.next();
        int[] to = new int[] {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        int[] ds = new int[] {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        for (int i = 0; i < s.length(); i++) {
            int a = s.charAt(i) - 'a', b = t.charAt(i) - 'a';
            if ((to[a] == -1 ? to[a] = b : to[a]) != b || (ds[b] == -1 ? ds[b] = a : ds[b]) != a) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}