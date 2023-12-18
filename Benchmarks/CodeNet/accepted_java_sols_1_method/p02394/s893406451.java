import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int r = sc.nextInt();
        sc.close();
        if(x+r>X||y+r>Y||x+r<=0||y+r<=0){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
    }
}
