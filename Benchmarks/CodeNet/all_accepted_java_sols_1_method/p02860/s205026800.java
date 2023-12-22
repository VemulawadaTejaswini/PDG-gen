import java.util.Scanner;
import java.util.Arrays;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    char[] c = s.toCharArray();
    String Before = "";
    String After = "";
    
    for(int i=0; i<n/2; i++){
      Before += c[i];
    }
    
    for(int j=n/2; j<n; j++){
      After += c[j];
    }
    
    if(Before.equals(After)){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}
