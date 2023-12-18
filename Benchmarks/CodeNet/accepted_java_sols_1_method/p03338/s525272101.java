import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String s = sc.next();
        int ans = 0;
        
        for (int i=1; i<n; i++){
            String str1 = s.substring(0,i);
            String str2 = s.substring(i);
            int count = 0;
            int[] flg1 = new int[26];
            int[] flg2 = new int[26];
            
            for (int j=0; j<str1.length(); j++){
                flg1[str1.charAt(j)-'a']=1;
            }
            for (int j=0; j<str2.length(); j++){
                flg2[str2.charAt(j)-'a']=1;
            }
            for (int j=0; j<26; j++){
                if (flg1[j]==1 && flg2[j]==1){
                  count++;
                }
            }
            
            ans = Math.max(ans,count);
        }
        
        System.out.println(ans);
    }
}
