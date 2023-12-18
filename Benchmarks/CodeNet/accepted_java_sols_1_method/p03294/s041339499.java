import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
      int n=Integer.parseInt(line);
      line=sc.nextLine();
      String s[]=line.split(" ",0);
      int num[]=new int[n];
      for(int i=0;i<n;i++){
      	num[i]=Integer.parseInt(s[i]);
      }
      int ans=0;
      for(int i=0;i<n;i++)ans+=num[i];
      
        System.out.println((ans-n));
    }
}