import java.util.Scanner;

class SumInt{

    private int calculate(int num, int start, int n, int s){
        int tmp = num + start;
        if (tmp > s) return 0;
        if (n == 0){
            if (tmp == s) return 1;
            else return 0;
        }
        int add = 0;
        for (int i = num + 1; i < 10; i++){
            add += calculate(i, tmp, n-1, s);
        }
        return add;
    }

    public int getCombination(int n, int s) {
        int a = 0;
        for (int i = 0; i < 10; i++){
            a += calculate(i, 0, n-1, s);
        }
        return a;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt(), s = sc.nextInt();
            if (n ==0 && s ==0)break;
            SumInt si = new SumInt();
            System.out.println(si.getCombination(n, s));
        }
    }
}