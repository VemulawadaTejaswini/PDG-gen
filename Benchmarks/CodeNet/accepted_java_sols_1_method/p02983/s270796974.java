import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    int L = Integer.parseInt(S[0]);
    int R = Integer.parseInt(S[1]);
    
    int min = 2019;
    for(int i = L; i <= R && i < L+2018; i++){
      for(int j = i+1; j <= R && j < L+2019; j++){
        int n = (i % 2019) * (j % 2019);
        if(n % 2019 < min){
          min = n%2019;
        }
      }
    }
    
    System.out.println(min);
  }
}