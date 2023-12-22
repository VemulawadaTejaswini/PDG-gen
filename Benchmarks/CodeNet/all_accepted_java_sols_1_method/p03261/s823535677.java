import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String W[] = new String[N];
    for(int i=0;i<N;i++){
      W[i]=sc.next();
    }
    for(int i=0;i<N-1;i++){
      if(!W[i].substring(W[i].length()-1,W[i].length()).equals(W[i+1].substring(0,1))){
        System.out.println("No");
        return;
      }
    }
    Arrays.sort(W);
    for(int i=0;i<N-1;i++){
      if(W[i].equals(W[i+1])){
        System.out.println("No");
        return;
      }
    }
    System.out.println("Yes");
         
  }
  

  
}