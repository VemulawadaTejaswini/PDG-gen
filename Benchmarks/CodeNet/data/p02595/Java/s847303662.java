import java.util.*;
import static java.lang.Math.sqrt;
 
class Distance{
 
 
public static void main(String[] args){
  
  Scanner s=new Scanner(System.in);
  int i=0;
int N=s.nextInt();
int D=s.nextInt();
 int x1,y1=0;
  float result=0.0;
  int count=0;
  while(i<N){
  x1=s.nextInt();
    y1=s.nextInt();
    result=sqrt((x1*x1)+(y1*y1));
    if(result>=5.0){
    count++;}
  
  i++;}
  
 System.out.println(count);
}
 
}