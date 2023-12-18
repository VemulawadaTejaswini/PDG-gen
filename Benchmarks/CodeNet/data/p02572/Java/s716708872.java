import java.util.*;
import java.lang.Math;

public class Main{



public static void main(String[] args){
Scanner scanner1 = new Scanner(System.in);
Scanner scanner2 = new Scanner(System.in);
int a=scanner1.nextInt();
String[] bb=scanner2.nextLine().split(" ");
long[] b=new long[a];
for(int i=0;i<a;i++){
  b[i]=Long.parseLong(bb[i]);
}

long c=0;
for(int i=0;i<a-1;i++){
  for(int k=i+1;k<a;k++){
    c=c+b[i]*b[k];
  }
}
long d=10^9+7;
System.out.println(c%d);


}
}
