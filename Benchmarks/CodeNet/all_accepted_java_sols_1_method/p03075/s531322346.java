import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] x = new int[6];
    for(int i=0; i<6; i++){
      x[i] = sc.nextInt();
    }
    if(x[4]-x[0]<=x[5]){
      System.out.println("Yay!");
    }else{
      System.out.println(":(");
    }
  }
}