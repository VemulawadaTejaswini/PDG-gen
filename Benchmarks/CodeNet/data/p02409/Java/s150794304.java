import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        ArrayList<String[]> list = new ArrayList<String[]>();
        int[][] ans = new int[12][10];
        for(int i = 0; i < 12; i++) {
            for(int j = 0; j < 10; j++) {
                ans[i][j] = 0;
            }
        }
        //S:0 H:1 c:2 D:3
        Scanner sc = new Scanner(System.in);
        //1番目の読み取り回数nを取得
        String line = sc.nextLine();
        int n = Integer.parseInt(line);
        //n回繰り返して配列をlistへ
        for(int i = 0; i < n; i++) {
            String line1 = sc.nextLine();
            String[] linesp1 = line1.split(" ");
            list.add(linesp1);
        }
         
        for(int i = 0; i < list.size(); i++) {
            int tou = Integer.parseInt(list.get(i)[0]);//1~4
            int kai = Integer.parseInt(list.get(i)[1]);//1~3
            int ban = Integer.parseInt(list.get(i)[2]);//1~10
            int nin = Integer.parseInt(list.get(i)[3]);// 
             
            if(tou == 1) {
                ans[kai - 1][ban - 1] += nin;
            }
            if(tou == 2) {
                ans[kai + 2][ban - 1] += nin;
            }
            if(tou == 3) {
                ans[kai + 5][ban - 1] += nin;
            }
            if(tou == 4) {
                ans[kai + 8][ban - 1] += nin;
            }
        }
        for(int i = 0; i < 12; i++) {
            for(int j = 0; j < 10; j++) {
                System.out.print(" ");
                System.out.print(ans[i][j]);
                 
                if(j == 9) {
                    System.out.println("");
                }
            }
            if(i % 3 == 2 && i != 11) {
                System.out.println("####################");
            }
        }
    }
}
