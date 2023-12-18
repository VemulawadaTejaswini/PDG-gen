import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int min=1000000;
    int max=-1000000;
    long sum=0L;
    for(int i=0;i<a;i++){
      int b=sc.nextInt();
      if(min>b) min=b;
      if(max<b) max=b;
      sum+=b;
    }
    System.out.println(min+" "+max+" "+sum);
  }
}

