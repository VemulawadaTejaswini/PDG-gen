import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    int sameCount = 0 ;

    if( a == b ){
      sameCount ++ ;
    }
    if( b == c ){
      sameCount ++ ;
    }
    if( c == a ){
      sameCount ++ ;
    }

    switch(sameCount){
      case 0:
        System.out.println(3);
      break;
      case 1:
        System.out.println(2);
      break;
      case 3:
        System.out.println(1);
      break;
    }
  }
}
