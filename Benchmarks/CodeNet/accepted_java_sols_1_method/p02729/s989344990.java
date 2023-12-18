import java.util.*;
public class Main{
  public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    //N even
    int n = sc.nextInt();
    //M odds
    int m = sc.nextInt();
    //ans N only
    int ansN = 0;
    //ans M only
    int ansM = 0;
    
    ansN = n*(n-1)/2;
    ansM = m*(m-1)/2;      

    System.out.println(ansN + ansM);
    
  }
}