import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       for(;;) {
          char[] s=sc.next().toCharArray();
          if(s[0]=='0')break;
          int[] l= {0,0};
          for(int i=1;i<s.length;i++) {
              l[s[i]-'A']++;
          }
          l[l[0]>l[1]?0:1]++;
          System.out.println(l[0]+" "+l[1]);
       }
    }
}
