import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int[] a=new int[101];
    for(int i=1;i<=9;i++){
      a[sc.nextInt()]=i;
    }
    boolean[] b=new boolean[10];
    int n=sc.nextInt();
    for(int i=0;i<n;i++){
      b[a[sc.nextInt()]]=true;
    }
    boolean flag;
    for(int i=0;i<3;i++){
      flag=true;
      for(int j=0;j<3;j++){
        flag=flag&&b[i*3+j+1];
      }
      if(flag){
        System.out.println("Yes");
        return;
      }
    }
    for(int i=0;i<3;i++){
      flag=true;
      for(int j=0;j<3;j++){
        flag=flag&&b[j*3+i+1];
      }
      if(flag){
        System.out.println("Yes");
        return;
      }
    }
    flag=true;
    for(int i=0;i<3;i++){
      flag=flag&&b[i*4+1];
    }
    if(flag){
      System.out.println("Yes");
      return;
    }
    flag=true;
    for(int i=0;i<3;i++){
      flag=flag&&b[i*2+3];
    }
    if(flag){
      System.out.println("Yes");
      return;
    }
    System.out.println("No");
  }
}