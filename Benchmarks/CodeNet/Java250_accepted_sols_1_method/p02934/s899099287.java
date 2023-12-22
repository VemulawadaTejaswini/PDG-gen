import java.util.*;
 
public class Main{
 
  public static void main(String[] args){
  
    Scanner sc = new Scanner(System.in);
    ArrayList<Double> nums = new ArrayList<>();
    double a = 0;
    int i = 0;
    
    while(sc.hasNext()){
    	nums.add(sc.nextDouble());
    }
    
    for(double num : nums){
      if(i == 0){
        i = 1;
      }else{
    	a += 1/num;
      }
    }
    
    System.out.println(1/a);
    
  }
}