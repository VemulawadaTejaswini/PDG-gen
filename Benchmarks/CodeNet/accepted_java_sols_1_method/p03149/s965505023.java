import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] a = new int[4];
    for(int i = 0;i < 4;i++)a[i]=sc.nextInt();
    Arrays.sort(a);
    if(a[0]==1&&a[1]==4&&a[2]==7&&a[3]==9)System.out.println("YES");
    else System.out.println("NO");
  }
}