import java.util.*;
import java.util.stream.Collectors;

public class Main{
  public static void main(String[] args){
    
    Scanner scan = new Scanner(System.in);
    int val  = scan.nextInt();
    int val2 = scan.nextInt();
    int val3 = scan.nextInt();
    
    //int[] prelist ={val,val2,val3};
    List<Integer> prelist = new ArrayList<Integer>();
    prelist.add(val);
    prelist.add(val2);
    prelist.add(val3);
    
    
    
    List<Integer> list = prelist.stream().distinct().collect(Collectors.toList());
    System.out.println(list.size());
    
    
    
    
    
  }
}