import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int aa = Math.max(a,b);
    int bb = Math.min(a,b);
    for (int i=0; i<aa; i++){
      if (i != aa-1) {
        System.out.print(bb);
      }else{
        System.out.println(bb);
      }
    }
  }
}