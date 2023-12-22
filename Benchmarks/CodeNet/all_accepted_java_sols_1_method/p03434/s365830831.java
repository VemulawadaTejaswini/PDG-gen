import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int a[] = new int[N];
    boolean isAlice = true;
    int alice =0;
    int bob = 0;
    for(int i=0;i<N;i++){
      a[i]=sc.nextInt();
    }
    Arrays.sort(a);
    for(int i=0;i<N;i++){
      if(isAlice){
        alice=alice+a[N-1-i];
      }else{
        bob=bob+a[N-1-i];
      }
      isAlice=!isAlice;
    }
    System.out.println(alice-bob);
  }
  

  
}