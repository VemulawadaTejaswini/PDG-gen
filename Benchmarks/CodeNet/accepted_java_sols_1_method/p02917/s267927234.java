import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] b = new int[110];
      for (int i=0; i<n-1; i++) b[i] = sc.nextInt();
      int sum = 2*b[0];
      if(n>2) {
        for (int i=1; i<n-1; i++) {
           if(b[i]>=b[i-1]) sum += b[i]; 
           else sum += 2*b[i]-b[i-1];
        }
      }
      System.out.println(sum);
    }
}

