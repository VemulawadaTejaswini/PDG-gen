import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        int craneLeg, turtleLeg, headTotal, legTotal; 
        int craneCnt, turtleCnt;
        
        craneLeg = 2;
        turtleLeg = 4;
        headTotal = scan.nextInt();
        legTotal = scan.nextInt();
        
        for(int i = 0; i <= headTotal; i++) {
            craneCnt = i;
            turtleCnt = headTotal - i;

            if(craneCnt * craneLeg + turtleCnt * turtleLeg == legTotal) {
                System.out.println("Yes");
                scan.close();
                return;
            }
        }
        System.out.println("No");
        scan.close();
        return;
    }
}