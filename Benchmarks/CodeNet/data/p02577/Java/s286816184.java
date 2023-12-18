import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.HashSet;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Double  N=sc.nextDouble();

    if(N%9==0){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
}
}
