import java.util.Scanner;

public class Main {
    public static void main(String[] args ) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        while(n != 0 || x != 0) {
            System.out.println(combo(1, n, 0, x, 0));
            n = scanner.nextInt();
            x = scanner.nextInt();
        }
    }

    public static int combo(int index, int n, int sum, int x, int selected){
        if(index > n + 1)
            return 0;
        else{
            if(sum == x && selected == 3)
                return 1;
            else if(sum > x)
                return 0;
            else{
                if(selected > 3)
                    return 0;
                else
                    return combo(index + 1, n, sum + index, x, selected + 1) + combo(index + 1, n, sum, x, selected);
            }
        }
    }

}

