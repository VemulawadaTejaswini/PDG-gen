import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        boolean as = dfs(x,y);
        System.out.println(as ? "Yes" : "No");
    }

    private static boolean dfs(int x, int y) {
        if(x <= 0){
            return x == 0 && y == 0;
        }
        return dfs(x-1,y-2) || dfs(x-1,y-4);
    }
}