import java.util.*;

class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    char[] S = sc.next().toCharArray();
    int[] counts = new int[N];
    int min = 0;
    for(int i=1; i < N; i++){
      if(S[i] == 'E'){
        ++min;
      }
    }
    
    int current = min;    
    for(int i=1; i < N; i++){
      if(S[i] == 'E') --current;
      if(S[i - 1] == 'W') ++current;
      if(min > current){
        min = current;
      }
    }
    
    System.out.println(min);
  }
}