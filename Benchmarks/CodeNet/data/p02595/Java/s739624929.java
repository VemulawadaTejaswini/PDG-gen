import java.util.*;
class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int d=sc.nextInt();
  double dd=Math.pow(d,2);
  int count=0;
  for(int i=0;i<n;i++){
    double a=Math.pow(sc.nextInt(),2)+Math.pow(sc.nextInt(),2);
    if(a<=dd){
      count++;
    }
  }
  System.out.println(count);
}
}