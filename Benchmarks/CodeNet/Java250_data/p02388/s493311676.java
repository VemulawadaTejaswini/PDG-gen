import java.util.Scanner;
class Main{
    public void kozueteacher() {
    Scanner sc = new Scanner(System.in); 
    int x = sc.nextInt();
        int y = x * x;
        int z = y * x;
        System.out.println(z);
    }
    public static void main(String[] args) {
        new Main().kozueteacher();
    }
}