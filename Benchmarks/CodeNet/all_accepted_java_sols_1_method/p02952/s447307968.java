import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();

    sc.close();

    int a = 100000;

    int l = String.valueOf(N).length();

    int ans = 0;

    switch(l){
      case 1:
        ans = N;
      break;
      case 2:
        ans = 9;
      break;
      case 3:
        ans = 9 + N - 99;
      break;
      case 4:
        ans = 909;
      break;
      case 5:
      ans = 909 + N - 9999;
      break;
      case 6:
        ans = 90909;
      break;
    }

    System.out.println(ans);
    
  }

}