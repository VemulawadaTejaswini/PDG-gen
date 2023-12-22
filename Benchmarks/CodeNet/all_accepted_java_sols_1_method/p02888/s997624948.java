import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int l[] = new int [n];
    for(int i=0;i<n;i++){
      l[i]=sc.nextInt();
    }
    int answer =0;
    Arrays.sort(l);
    for(int i=2;i<n;i++){
      for(int j=0;j<i-1;j++){
        for(int k=j+1;k<i;k++){
          if(l[i]<l[j]+l[k]){
            answer = answer + i-k;
            break;
          }
        }
      }
    }
    System.out.println(answer);
    
  }
  

  
}