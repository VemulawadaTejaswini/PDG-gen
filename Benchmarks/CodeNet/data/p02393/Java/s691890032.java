import java.util.*;

class Main{
 public static void main(String[] args){
  Scanner scan = new Scanner(System.in).useDelimiter("\\s\\n*");

  int a=scan.nextInt(),b=scan.nextInt(),c=scan.nextInt();

  int d;

  for(int e=0;e<3;e++){
   if(a>b){d=a;a=b;b=d;}
   if(b>c){d=b;b=c;c=d;}
  }
  System.out.println(a" "b" "c);  
 }
}