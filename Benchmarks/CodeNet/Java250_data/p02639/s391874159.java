import java.util.*;
class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int b=0;
    int[] a=new int[5];
    for(int i=0;i<5;i++){
      a[i]=sc.nextInt();
      if(a[i]==0) b=i+1;
    }
    System.out.printf("%d",b);
  }
}