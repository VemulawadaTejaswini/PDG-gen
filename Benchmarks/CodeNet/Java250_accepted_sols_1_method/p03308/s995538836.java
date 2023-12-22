import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
      line = sc.nextLine();
        String s[]=line.split(" ",0);
        int a[]=new int[s.length];
        for(int i=0;i<s.length;i++){
            a[i]=Integer.parseInt(s[i]);
        }
        int max= a[0];
        int min=a[0];
 
        for (int i = 1; i < a.length; i ++) {
            max = Math.max(max, a[i]);
            min = Math.min(min, a[i]);
        }
        System.out.println(max-min);
    }
}