import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        sc.close();
        int n = s.length;
        int cnt = 0;
        int res;
        //白黒
        for(int i=0;i<n;i++){
            if(i%2==0 && s[i] !='1'){
                cnt++;
            }else if(i%2 != 0 && s[i]!='0'){
                cnt++;
            }
        }
        //黒白
        res = cnt;
        cnt = 0;
        for(int i=0;i<n;i++){
            if(i%2==0 && s[i] !='0'){
                cnt++;
            }else if(i%2 != 0 && s[i]!='1'){
                cnt++;
            }
        }
        System.out.println(Math.min(res,cnt));
    }
}