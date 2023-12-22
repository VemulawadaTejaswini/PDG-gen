import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int current = sc.nextInt();
    int mini = current,maxi = current,distance = 0;
    do{
      int res = Math.max(Math.abs(current - mini), Math.abs(current - maxi));
      if(res > distance){distance = res;}
      current = sc.nextInt();
    }while(sc.hasNext());
    if(distance > current){System.out.println(":(");}
    else{System.out.println("Yay!");}
  }
}