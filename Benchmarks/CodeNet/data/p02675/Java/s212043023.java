import java.util.*;
class Main {

  static Integer[] PON_ARR = new Integer[]{0,1,6,8};
  static  Integer[] BON_ARR = new Integer[]{3};
  static  List<Integer> PON_LIST = Arrays.asList(PON_ARR);
  static  List<Integer> BON_LIST = Arrays.asList(BON_ARR);

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    String s = sc.nextLine();
    
    int lenS = s.length();
    
    if( lenS > k ) {
        System.out.println( s.substring(0, k) + "...");    
    }else{
        System.out.println( s );    
    }
  }
}
