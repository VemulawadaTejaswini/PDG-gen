import java.util.*;
class Main {
 
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int val = a - (int)(a/10)*10;
    Integer[] ponArr = new Integer[]{0,1,6,8};
    Integer[] bonArr = new Integer[]{3};
    List<Integer> ponList = Arrays.asList(ponArr);
    List<Integer> bonList = Arrays.asList(bonArr);
    
    if(ponList.contains(val)){
      System.out.println("pon");
    }else if(bonList.contains(val)){
      System.out.println("bon");
    }else{
      System.out.println("hon");
    }
  }
}