import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int r = 0;
        int g = 0;
        int b = 0;
        for (int i=0;i<n;i++){
            if (s.charAt(i)=='R')r++;
            else if (s.charAt(i)=='G')g++;
            else b++;
        }
        long ans = r*g*(long)b;
        for (int i=0;i<n-2;i++){
            for (int j=i+1;j<n-1;j++){
                if (j+j-i<n&&s.charAt(i)!=s.charAt(j)&&s.charAt(j)!=s.charAt(j+j-i)&&s.charAt(j+j-i)!=s.charAt(i))ans--;
            }
        }
        System.out.println(ans);
    }

}
