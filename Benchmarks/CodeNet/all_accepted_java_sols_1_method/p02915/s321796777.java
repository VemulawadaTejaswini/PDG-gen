import java.util.*;
public class Main {
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  int N = sc.nextInt();
  if(1<=N && N<=9){
  switch ( N ) {
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    case 9:
    System.out.println (N*N*N);
  }
 }
}
}