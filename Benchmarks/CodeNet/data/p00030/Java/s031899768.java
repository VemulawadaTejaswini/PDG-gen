import java.util.Scanner;

public class Main {
    public static void main(String[] args ) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = scanner.nextInt();
        while(n != 0 || s != 0) {
            System.out.println(dfs(0, 0, s, 0, n));
            n = scanner.nextInt();
            s = scanner.nextInt();
        }
    }

    public static int dfs(int index, int sum, int s, int selected, int n){
        if(index > 10)
            return 0;
        else{
            if(sum == s && selected == n)
                return 1;
            else if(sum > s)
                return 0;
            else{
                if(selected > n)
                    return 0;
                else
                    return dfs(index + 1,sum + index, s, selected + 1, n) + dfs(index + 1,sum, s, selected, n);
            }
        }
    }
}

