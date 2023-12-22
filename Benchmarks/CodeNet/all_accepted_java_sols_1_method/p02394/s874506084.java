import java.util.Scanner;

class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int w = Integer.parseInt(sc.next());
        int h = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());
        int y = Integer.parseInt(sc.next());
        int r = Integer.parseInt(sc.next());
        if(0<=x-r&&x+r<=w&&0<=y-r&&y+r<=h) System.out.println("Yes");
        else System.out.println("No");
    }
}