import java.util.*;

public class Main{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] speed = new int[n-1];
        int[] first = new int[n-1];
        int[] start = new int[n-1];
        
        for(int i = 0; i < n-1; i++){
          speed[i] = sc.nextInt();
          first[i] = sc.nextInt();
          start[i] = sc.nextInt();
        }
      
        for(int i = 0; i < n; i++){
        int time = 0;
         for(int j = i; j < n-1; j++){
          if(time < first[j]){
            time = first[j] + speed[j];
          }else if(time % start[j] ==0){
            time += speed[j];
          }else{
            time = time + start[j] - (time % start[j]) + speed[j];
         }
       }
           System.out.println(time);
     }
  }
}
