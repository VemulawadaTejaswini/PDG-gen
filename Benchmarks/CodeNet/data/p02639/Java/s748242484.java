import java.util.*;
class Main{
  static Scanner sc = new Scanner(System.in);
  public static void main(String[] args){
    int x[] = new int[9999999];
    for(int i=0;i<5;i++){
      x[sc.nextInt()]=i;
    }
    System.out.println(x[0]+1);
  }
}