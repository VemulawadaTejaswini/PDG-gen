import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();
    int l = line.length();
    String NumSt[] = new String[l];
    NumSt = line.split("",0);
    int dig;
    int sum = 0;
    
    for(int i = 0; i < l; i++){
      dig = Integer.parseInt(NumSt[i]);
      sum += dig;
    }
    
    if(sum % 9 == 0){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}