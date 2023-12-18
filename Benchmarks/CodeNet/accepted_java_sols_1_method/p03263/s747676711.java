import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H =sc.nextInt();
        int W =sc.nextInt();
        int field[][] = new int[H][W];
        for(int i=0;i<H;i++) {
            for(int j=0;j<W;j++) {
                int a = sc.nextInt();
                field[i][j]= a;
            }     
        }
        sc.close();
        
        int mul = 0;
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<H;i++) {
            for(int j=0;j<W;j++) {
                if(j+1>=W)continue;
                if(field[i][j]%2==0)continue;
                int tmp1 = i+1;
                int tmp2 = j+1;
                int tmp3 = j+2;
                sb.append(tmp1+" "+tmp2+" "+tmp1+ " "+ tmp3 + "\n");
                field[i][j]--; field[i][j+1]++;mul++;
                
            }     
        }
        
        for(int i=0;i<H;i++) {
            if(i+1>=H)continue;
            if(field[i][W-1]%2==0)continue;
            int tmp1 = i+1;
            int tmp2 = i+2;
            int tmp3 = W;
            sb.append(tmp1+" "+tmp3+" "+tmp2+" "+tmp3+ "\n");
            field[i][W-1]--; field[i+1][W-1]++;mul++;
        }

        System.out.println(mul);
        System.out.println(sb.toString());
        
    }
}
