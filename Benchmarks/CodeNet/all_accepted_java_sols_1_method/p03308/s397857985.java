import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] numlist = new int[N];
    
    for(int i=0;i<N;i++){
      numlist[i]=sc.nextInt();
    }
    Arrays.sort(numlist);
    
    int diff=numlist[N-1]-numlist[0];
    
    System.out.println(diff);
  }
}

    