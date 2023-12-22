import java.util.*;

public class Main{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    List<Long> strong = new ArrayList<Long>();
        
    for(int i=0;i<3*N;i++){
      long a = sc.nextInt();
      strong.add(a);
    }
    
    Collections.sort(strong);
    long num=0;
    
    for(int i=0;i<2*N;i++){
      if(i % 2 == 1){
        num += strong.get(3*N-1-i);
      }
    }
    
    System.out.println(num);
  }
}

