import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    
    String s = sc.nextLine();
    int count = 0;
    if(String.valueOf(s.charAt(0)).equals("1")){
      count+=1;
    }
    if(String.valueOf(s.charAt(1)).equals("1")){
      count+=1;
    }
    if(String.valueOf(s.charAt(2)).equals("1")){
      count+=1;
    }
    System.out.println(count);
  }
}