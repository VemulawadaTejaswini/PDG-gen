import java.util.Scanner;
import java.util.Arrays;


public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);


    int n = sc.nextInt();
    boolean flag = true;
    String s;
    char[][] c =  new char[n][2];
    String[] ss = new String[n];
    for(int i=0; i<n; i++){
      s = sc.next();
      c[i][0] = s.charAt(0);
      c[i][1] = s.charAt(s.length()-1);
      if(Arrays.asList(ss).contains(s)){
        flag = false;
      }
      ss[i] = s;

    }

    for(int i=0; i<n-1; i++){
      if(c[i][1] != c[i+1][0]){
        flag = false;
      }
    }
    if(flag){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }






  }
}