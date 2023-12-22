import java.util.*;
class Main {

  static Integer[] PON_ARR = new Integer[]{0,1,6,8};
  static  Integer[] BON_ARR = new Integer[]{3};
  static  List<Integer> PON_LIST = Arrays.asList(PON_ARR);
  static  List<Integer> BON_LIST = Arrays.asList(BON_ARR);

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int val = a - (int)(a/10)*10;
    
    if(PON_LIST.contains(val)){
      System.out.println("pon");
    }else if(BON_LIST.contains(val)){
      System.out.println("bon");
    }else{
      System.out.println("hon");
    }
  }
}