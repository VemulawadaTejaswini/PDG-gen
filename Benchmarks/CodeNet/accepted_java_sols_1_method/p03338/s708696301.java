import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        int max = 0;
        for (int i=1;i<N;i++){
            String strr = S.substring(0,i);
            String strl = S.substring(i);
            int count = 0;
            boolean[] b1 = new boolean[26];
            boolean[] b2 = new boolean[26];
            for (int j=0;j<strr.length();j++){
                b1[strr.charAt(j)-'a']=true;
            }
            for (int j=0;j<strl.length();j++){
                b2[strl.charAt(j)-'a']=true;
            }
            for (int j=0;j<26;j++){
                if (b1[j]&&b2[j]){
                  count++;
                }
            }
            max = Math.max(max,count);
        }
        System.out.println(max);
    }
}