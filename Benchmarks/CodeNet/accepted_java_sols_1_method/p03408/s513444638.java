import java.util.Scanner;
import java.util.Arrays;
class Main{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String[] blue = new String[n];
        for(int i=0;i<n;i++){
            blue[i]=scn.next();
        }
        Arrays.sort(blue);
        int m = scn.nextInt();
        String[] red = new String[m];
        for(int j=0;j<m;j++){
            red[j]=scn.next();
        }
        Arrays.sort(red);
        int money = 0;
        for(int i=0;i<n;i++){
            int cnt = 1;
            for(int j=i+1;j<n;j++){
                if(j<n&&blue[i].equals(blue[j])){
                    cnt++;
                }
            }
            int r_cnt=0;
            for(int j=0;j<m;j++){
                if(blue[i].equals(red[j])) r_cnt++;
            }
           money= Math.max(money,cnt-r_cnt);
        }
        System.out.println(money);
    }
}
