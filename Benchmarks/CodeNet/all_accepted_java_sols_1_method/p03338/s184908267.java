import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        int max = 0;
        for (int i=1;i<N;i++){
            String str1 = S.substring(0,i);
            String str2 = S.substring(i);
            int count = 0;
            boolean[] ar1 = new boolean[26];
            boolean[] ar2 = new boolean[26];
          
            for (int j=0;j<str1.length();j++){
                ar1[str1.charAt(j)-'a']=true;
            }
            for (int j=0;j<str2.length();j++){
                ar2[str2.charAt(j)-'a']=true;
            }
            for (int j=0;j<26;j++){
                if (ar1[j]&&ar2[j]){
                  count++;
                }
            }
            max = Math.max(max,count);
        }
        System.out.println(max);
    }
}
