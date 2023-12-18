import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    long mul = 1;
    boolean flag = true;
    ArrayList<Long> array = new ArrayList<Long>();
    for(int i = 0;i < num;i++){
      array.add(sc.nextLong());
    }
    Collections.sort(array);
    for(Long i : array){
      mul *= i;
      if(1000000000000000000 < mul){
        flag = false;
        break;
      }
    }
    if(flag){
      System.out.println(mul);
    }
    else{
      System.out.println(-1);
    }
  }
}