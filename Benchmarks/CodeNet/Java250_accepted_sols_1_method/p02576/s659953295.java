import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.HashSet;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N=sc.nextInt();
    int X=sc.nextInt();
    int T=sc.nextInt();


if(N%X==0){
    System.out.println(T*((N-N%X)/X));

}else{
  System.out.println(T*((N-N%X)/X+1));

}
}
}
