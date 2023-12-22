import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n;
        int[] ary;
        double m, a2, sub;
        while(true){
            n = scanner.nextInt();
            if(n == 0)break;
            ary = new int[n];
            m = 0;
            a2 = 0;
            for(int i = 0; i < n; i++){
                ary[i] = scanner.nextInt();
                m += ary[i];
            }
            m /= n;
            for(int i = 0; i < n; i++){
                sub = ary[i] - m;
                a2 += sub*sub;
            }
            a2 /= n;
            System.out.println(Math.sqrt(a2));

        }

    }
}

