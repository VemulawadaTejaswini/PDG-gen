import java.util.*;
class Main{
    public static void main(String[] args) {
        //入力
        Scanner scn=new Scanner(System.in);
        String tile=scn.next();
        //処理
        int[] cnt=new int[2];
        for(int i=0;i<2;i++){
            cnt[i]=0;
            for(int j=0;j<tile.length();j++){
                if(j%2==0&&Character.getNumericValue(tile.charAt(j))==i) cnt[i]++;
                
                if(j%2==1&Character.getNumericValue(tile.charAt(j))!=i) cnt[i]++;
                
            }
        }
       //出力
        System.out.println(Math.min(cnt[0],cnt[1]));
    }
}
