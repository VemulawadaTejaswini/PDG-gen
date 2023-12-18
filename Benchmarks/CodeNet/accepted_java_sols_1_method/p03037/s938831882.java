import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int max = 0, min = 100000;
    for(int i = 0; i < m; i++){
      max = Math.max(max , sc.nextInt());
      min = Math.min(min , sc.nextInt());
    }
    if(min < max) System.out.println(0);
    else System.out.println(min - max + 1);
  } 
}
