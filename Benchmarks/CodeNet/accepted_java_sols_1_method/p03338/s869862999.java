import java.util.*;
class Main
{
  public static void main (String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    int ans = 0;
    for(int i = 0; i < n-1; i++)
    {
      int[] xx = new int[26];
      int[] yy = new int[26];
      
      for(int j = 0; j <= i; j++)
      {
        xx[s.charAt(j) - 'a']++;
      }
      for(int k = i+1; k < n; k++)
      {
        yy[s.charAt(k) - 'a']++;
      }
      int tmp = 0;
      for(int l = 0; l < 26; l++)
      {
        if(xx[l] > 0 && yy[l] > 0) tmp++;
      }
      ans = Math.max(ans, tmp);
    }
    System.out.println(ans);
  }
}