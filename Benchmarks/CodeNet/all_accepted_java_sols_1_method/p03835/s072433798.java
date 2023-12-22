
import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int K = sc.nextInt();
    int S = sc.nextInt();
    int answer=0;
    for(int i=0;i<=K;i++){
      if(i>S){
        break;
      }
      for(int j=i;j<=K;j++){
        if(i+j>S){
          break;
        }
        for(int l=j;l<=K;l++){
          if(i+j+l==S){
              if(i<j&&j<l){
                  answer=answer+6;
              }else if((i==j&&j<l)||(i<j&&j==l)){
                  answer=answer+3;
              }else{
                  answer++;
              }
            
            break;
          }
        }
      }
    }
    System.out.println(answer);
  }
  

  
}
