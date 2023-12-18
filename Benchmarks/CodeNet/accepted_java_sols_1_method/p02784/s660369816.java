import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
     int h = s.nextInt();
     int n = s.nextInt();
      int a[] = new int[n];
      int sum=0;
      for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
            sum = sum + a[i];
        }
      if(sum>=h){
      System.out.println ("Yes");
      }
    else
    {
    System.out.println ("No");
    }
    
    }
}