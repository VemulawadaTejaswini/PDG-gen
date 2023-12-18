import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int a[] = new int[N];
    int b[] = new int[N+1];
    int answer=0;
    for(int i=0;i<N;i++){
      a[i]=sc.nextInt();
      if(a[i]>=N+1){
        answer++;
      }else{
        b[a[i]]++;
      }
    }
    for(int i=1;i<N+1;i++){
      if(b[i]>i){
        answer=answer+(b[i]-i);
      }else if(b[i]==i){
        answer=answer;
      }else{
        answer=answer+b[i];
      }
    }
    System.out.println(answer);
    
  }
  

  
}