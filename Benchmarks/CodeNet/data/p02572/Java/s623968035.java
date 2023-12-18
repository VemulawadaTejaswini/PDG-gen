import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    ArrayList<Long> array = new ArrayList<Long>();
    long max = 0;
    for(int i = 0;i < num;i++){
      array.add(sc.nextLong());
      if(max < array.get(i)){
        max = array.get(i);
      }
    }
    long sum = 0;
    while(array.size() != 1){
      for(int i = 0;i < array.size();i++){
        if(max < array.get(i)){
          max = array.get(i);
        }
      }
      for(int i = 0;i < array.size();i++){
        if(max == array.get(i)){
          array.remove(i);
          break;
        }
      }
      for(Long i : array){
        sum += max * i;
      }
      max = 0;
    }
    System.out.println(sum % 1000000007);
  }
}
      
    