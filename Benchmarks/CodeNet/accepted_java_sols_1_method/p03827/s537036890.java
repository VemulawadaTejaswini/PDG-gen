import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int x = 0;
    int max=0;
    sc.nextLine();
    String[] input = sc.nextLine().split("");
    for(int i=0; i<input.length; i++){
      if(input[i].equals("I")){
        x++;
      }else{
        x--;
      }
      if(max<x){
        max=x;
      }
    }
    System.out.println(max);
  }
}