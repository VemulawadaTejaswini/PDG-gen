public class Main {
    public static void main(String[] args)  {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int N = Integer.parseInt(sc.next()), H = Integer.parseInt(sc.next()), W = Integer.parseInt(sc.next());
        System.out.println((N-H+1) * (N-W+1));
    }
}