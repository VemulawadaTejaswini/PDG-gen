import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] rec = new int[26];
        for(int i=0;i<s.length();i++){
            rec[s.charAt(i)-'a']++;
        }
        String ans = "Yes";
        for(int i=0;i<26;i++){
            if(rec[i]%2==1) ans = "No";
        }
        System.out.println(ans);
    }
}
