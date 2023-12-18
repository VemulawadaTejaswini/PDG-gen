import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int yen = scanner.nextInt();
        int sum = 0;
        int x1 = -1;
        int y1 = -1;
        int z1 = -1;

        for(int x = 0;x <= n;x++){
            for(int y = 0;y <= n - x;y++){
                sum = 10000 * x + 5000 * y + 1000 * (n - x - y);
                if(sum == yen){
                    x1 = x;
                    y1 = y;
                    z1 = n - x - y;
                }
                sum = 0;
            }
        }

        System.out.println(x1+" "+y1+" "+z1);
    }
}