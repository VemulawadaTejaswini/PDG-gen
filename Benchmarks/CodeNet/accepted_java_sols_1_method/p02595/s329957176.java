import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int dis = sc.nextInt();

        int count = 0;
        Long x, y;

        for(int i = 0; i < num; i++){
            x = sc.nextLong(); y = sc.nextLong();
            if( Math.sqrt(x*x+y*y) <= dis ){
                count++;
            }
        }

        System.out.println(count);
        sc.close();
    }
}