import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[]ans = new boolean[3+1];
        ans[sc.nextInt()] = true;
        ans[sc.nextInt()] = true;
        for(int i=1; i<=3; i++) {
            if(!ans[i]) System.out.println(i);
        }
    }
}