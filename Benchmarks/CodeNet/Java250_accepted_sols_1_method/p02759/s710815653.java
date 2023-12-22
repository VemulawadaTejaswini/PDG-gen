import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int result;
    if(n%2==1){
       result = n/2 + 1;
    }
    else{
      result = n/2;
    }
    System.out.println(result);
  }
}
