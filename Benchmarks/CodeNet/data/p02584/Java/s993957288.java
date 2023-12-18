import java.util.Scanner;
import java.util.Arrays;
public class Main{
 public static void main(String[] args) {
   Scanner kbd =new Scanner(System.in);
   long x=kbd.nextLong();
   long k=kbd.nextLong();
   long d=kbd.nextLong();
   long Min=Math.abs(x);
   int a=0;
   if(x>=0){
   for(int i=0;i<k;i++){
   if(Math.abs(x-d)>Min){
    break;
   }
   x=x-d;
   Min=Math.abs(x);
   a++;
}
}else{
for(int i=0;i<k;i++){
x=x+d;
if(Math.abs(x)>Min){
 break;
}
Min=Math.abs(x);
a++;
}
}

if(Math.abs(x)==d*2||(d-a)/2==0){
  System.out.println(x);
}else{
  System.out.println(x+d);
}



 }
}