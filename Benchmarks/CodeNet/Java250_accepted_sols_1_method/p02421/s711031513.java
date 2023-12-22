import java.util.*;

public class Main{
  public static void main(String args[]) {
    Scanner in  = new Scanner(System.in);
    int rnum = in.nextInt();
    int taro = 0, hanako = 0;

    for(int i = 0; i < rnum; i++){
      String p1 = in.next();
      String p2 = in.next();
      if( p1.compareTo(p2) < 0){
        hanako +=3;
      } else if(p1.compareTo(p2) > 0){
        taro += 3;
      } else if(p1.compareTo(p2) == 0){
        taro += 1;
        hanako += 1;
      }
    }

    System.out.println(taro + " " + hanako);
  }
}

