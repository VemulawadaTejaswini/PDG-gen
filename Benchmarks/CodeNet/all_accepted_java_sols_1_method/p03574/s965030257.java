import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        char[][] dic = new char[H+2][W+2];
        for(int row=1;row<=H;row++){
            String cur = sc.next();
            for(int col=1;col<=W;col++){
                dic[row][col] = cur.charAt(col-1);
            }
        }
        for(int row=1;row<=H;row++){
            for(int col=1;col<=W;col++){
                if(dic[row][col]=='#') continue;
                int cnt = 0;
                if(dic[row-1][col-1]=='#') cnt++;
                if(dic[row-1][col]=='#') cnt++;
                if(dic[row-1][col+1]=='#') cnt++;
                if(dic[row][col-1]=='#') cnt++;
                if(dic[row][col+1]=='#') cnt++;
                if(dic[row+1][col-1]=='#') cnt++;
                if(dic[row+1][col]=='#') cnt++;
                if(dic[row+1][col+1]=='#') cnt++;
                dic[row][col] = (char)(cnt+'0');
            }
        }
        for(int row=1;row<=H;row++){
            StringBuilder sb = new StringBuilder();
            for(int col=1; col<=W;col++) sb.append(dic[row][col]);
            System.out.println(sb.toString());
        }
    }
}