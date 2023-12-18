import java.util.*;
class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
  int a=sc.nextInt();
  boolean po=true;
  double aa=sc.nextDouble();
  for(int i=1;i<a;i++){
  aa*=sc.nextDouble();
    if(aa>1000000000000000000)po=false;
    aa%=1000000000000000000;
  }
  System.out.println((aa==0)?0:po?(long)aa:-1);
}
}
