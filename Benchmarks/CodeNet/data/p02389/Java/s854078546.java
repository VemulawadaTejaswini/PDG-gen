import java.util.Scanner;
class Main{
    int x,y,men,hen;
    public void kozueteacher() {
    Scanner sc = new Scanner(System.in);
    x = sc.nextInt();
    y = sc.nextInt();
        men = x * y;
        hen = x + x + y + y;
        System.out.println(men + " " + hen);
    }
    public static void main(String[] args) {
        new Main().kozueteacher();
    }
} 