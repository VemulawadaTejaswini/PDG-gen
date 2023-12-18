import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String str = sc.next();
        char[] c = str.toCharArray();
        int[] a = new int[str.length()];
        char[] ans = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N',
                        'O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        
        for(int i=0; i<str.length(); i++){
            a[i] = c[i]-65;
            //System.out.print(a[i]+">");
            a[i] += N;
            a[i] %= 26;
            //System.out.println(a[i]);
        }
        for(int i=0; i<str.length(); i++){
            System.out.print(ans[a[i]]);
        }
        System.out.println("");
    }
}