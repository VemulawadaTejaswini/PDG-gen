import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.HashSet;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String N=sc.next();
    String M=sc.next();
    String[] str = M.split("");

    if(N.concat(str[str.length-1]).equals(M)){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }



  }
}
