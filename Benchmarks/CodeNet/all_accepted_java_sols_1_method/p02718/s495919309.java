import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] a = new int[n];
    int sum = 0;
    int count = 0;
    for(int i = 0; i < n; i++)
    {
      a[i] = sc.nextInt();
      sum += a[i];
    }
    for(int i =0;i<n;i++)
    {
        if(4*m*a[i]>=sum)
        count++;
    }
    if(count>=m)
    System.out.println("Yes");
    else
    System.out.println("No");
  }}
    