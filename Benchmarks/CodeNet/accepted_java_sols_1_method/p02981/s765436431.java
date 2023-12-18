import java.util.*;

public class Main{
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    String[] nums = input.split(" ");
    int N = Integer.parseInt(nums[0]);
    int A = Integer.parseInt(nums[1]);
    int B = Integer.parseInt(nums[2]);
    
    System.out.println(N * A < B ? N * A : B);
  }
}