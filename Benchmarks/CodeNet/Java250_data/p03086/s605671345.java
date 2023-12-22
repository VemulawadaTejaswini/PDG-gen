import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ans = 0;
        for(int i = 0;i<s.length();i++){
            int j = i;
            int tmp = 0;
            while(j!=s.length()&&(s.charAt(j)=='A'||s.charAt(j)=='C'||s.charAt(j)=='G'||s.charAt(j)=='T')){
                tmp ++;
                ans = Math.max(ans,tmp);
                j++;
            }
        }
        System.out.println(ans);
    }
}