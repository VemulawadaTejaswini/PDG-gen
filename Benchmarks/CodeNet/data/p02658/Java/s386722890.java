import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    long[] a=new long[n];
    for(int i=0;n>i;i++){
      a[i]=sc.nextLong();
    }
    long total=1;
    for(int i=0;n>i;i++){
      total*=a[i];
    }
    long p=1;
    if(total>(Math.pow(10,18))){
      p=-1;
    }else{
      p=total;
    }
    System.out.println(p);
  }
}