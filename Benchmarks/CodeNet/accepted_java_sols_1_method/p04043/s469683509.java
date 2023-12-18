import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] N = new int[3];
    for(int i=0;i<3;i++){
      N[i] = sc.nextInt();
    }
    Arrays.sort(N);
    if(N[0]==5 && N[1]==5 && N[2]==7){        
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }
  }
}