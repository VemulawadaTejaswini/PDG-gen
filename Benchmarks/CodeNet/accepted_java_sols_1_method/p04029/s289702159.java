import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
      int a[]=new int[N];
      int sum=0;
      for(int i=0;i<a.length;i++){
    a[i]=i+1;
        sum=sum+a[i];
      }
      System.out.println(sum);
    }
  }
