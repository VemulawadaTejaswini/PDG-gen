import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = String.valueOf(n);
    int sum = 0;

    for(int i=0; i<s.length();i++){
      //System.out.println(s.charAt(i));

      sum = sum + s.charAt(i)-48;
      //System.out.println(sum);
    }

    // System.out.println(n);
    // System.out.println(s);

    if(n%sum==0){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }

  }
}