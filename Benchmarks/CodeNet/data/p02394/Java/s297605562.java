import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int W,H,x,y,r;
            W = sc.nextInt();
            H = sc.nextInt();
            x = sc.nextInt();
            y = sc.nextInt();
            r = sc.nextInt();
            if((0<=x && x<W && 0<=y && y<H) && (Math.abs(x-0)>=r || Math.abs(x-W)>=r) && (Math.abs(y-0)>=r || Math.abs(y-H)>=r)) {
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
