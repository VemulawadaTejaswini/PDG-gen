import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    if(N != 1){
        System.out.println(N*N*N);
    }else{
        System.out.println(N);
    }
  }
}