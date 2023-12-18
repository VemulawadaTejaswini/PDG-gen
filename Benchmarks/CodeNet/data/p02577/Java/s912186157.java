import java.util.Scanner;
public class Main {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String n = scan.nextLine();
    int len = n.length();
    long sum=0;
    long[] arr = new long[len];
    for(int i=0;i<len;i++){
      arr[i] = (long)(n.charAt(i));
    }
    for(int i=0;i<len;i++){
      sum += arr[i];
    }
    if(sum%9 == 0){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
  
}