import java.util.Scanner;
class Main{
    int W,H,x,y,r;
    public void en() {
        Scanner sc = new Scanner(System.in);
            W = sc.nextInt();
            H = sc.nextInt();
            x = sc.nextInt();
            y = sc.nextInt();
            r = sc.nextInt();
         
        if(x - r >= 0 && y - r >= 0 && x + r <= W && y + r <= H) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    public static void main(String[] args) {
        new Main().en();
    }
}