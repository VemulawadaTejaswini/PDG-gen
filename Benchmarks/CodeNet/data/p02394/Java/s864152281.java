import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int r = sc.nextInt();
        
        int x_max = x + r;
        int y_max = y + r;
        int x_min = x - r;
        int y_min = y - r;
        
        if ((x_max <= w) && (y_max <= h) && (x_min >= 0) && (y_min >= 0)) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
