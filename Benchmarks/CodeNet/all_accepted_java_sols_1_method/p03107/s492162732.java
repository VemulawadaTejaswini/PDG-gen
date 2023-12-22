import java.util.Scanner;

class Main{
  public static void main(String... args){
    char[] s = new Scanner(System.in).next().toCharArray();
    int[] arr = {0,0};
    
    for(char c : s){
      if(c == '1')arr[1]++;
      else arr[0]++;
    }
    
    
    System.out.println(2*Math.min(arr[0],arr[1]));
  }
}
