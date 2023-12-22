import java.util.*;

class Main{
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int A = sc.nextInt();
      int B = sc.nextInt();
      int C = sc.nextInt();
      int K = sc.nextInt();
      int timesCounter=0;
      int maxCounter=0;
      
      for(int i=0; i<A; i++){
        if(timesCounter == K){
          break;
        }
        timesCounter++;
        maxCounter++;
      }
      
      for(int i=0; i<B; i++){
        if(timesCounter == K){
          break;
        }
        timesCounter++;
      }
      
      for(int i=0; i<C; i++){
        if(timesCounter == K){
          break;
        }
        timesCounter++;
        maxCounter--;
      }
      
      System.out.println(maxCounter);
    }
}