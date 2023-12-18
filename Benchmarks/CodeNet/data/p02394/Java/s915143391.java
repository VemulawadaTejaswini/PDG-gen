import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		int W = sc.nextInt();
		int H = sc.nextInt();
		int x = sc.nextInt();
        int y = sc.nextInt();
        int r = sc.nextInt();

        if(W==x || H==y) {
            System.out.printf("No\n");
        } else if(x-r<0 || x+r>W || y-r<0 || y+r>H){
            System.out.printf("No\n");
        } else {
             System.out.printf("Yes\n");
        }
    } 
}
