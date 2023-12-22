import java.util.Scanner;
import java.util.ArrayList;

public class Main {
 
    public static void main(String[] args) {
      int i,N;
      Scanner sc=new Scanner(System.in);
      N=sc.nextInt();
      ArrayList<Integer> a=new ArrayList<Integer>();
      for(i=0;i<N;i++){
        int scan=sc.nextInt();
        a.add(scan);
      }
      
      System.out.println(N-solve(a));
      sc.close();
    }

  
  static int solve(ArrayList<Integer> ia){
    int i=0;
    for(int b:ia){
      if(b==i+1)
        i++;
    }
    if(i>0)
     return i;
    else
     return ia.size()+1; 
  }
}
 
