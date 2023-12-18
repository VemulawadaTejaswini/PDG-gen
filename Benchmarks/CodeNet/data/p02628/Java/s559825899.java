import java.util.*;
class Main{
  public static void main(String[] a){
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int k = s.nextInt();
    int x = 100;
    int y = 100;
    int z = 100;
    for(;n>0;n--){
      int d = s.nextInt();
      if(d<x){
        z=y;
        y=x;
        x=d;
        continue;
      }
      if(d<y){
        z=y;
        y=d;
        continue;
      }
      if(d<z){
        z=d;
      }
    }
    System.out.println(x+y+z);
  }
}