import java.util.*;
 
public class Main{
 
	public static void main(String[] args){
 
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] row = new String[N];
        int[] count = new int[N];
      
        for(int i = 0; i < N; i++){
          row[i] =sc.next();
        }
      
        Arrays.sort(row);
        int Max = 0;
        for(int i = 0; i < N; i++){
          for(int j = i+1; j < N; j++){
            if(row[i].equals(row[j])){
              count[i] +=1;
            }else{
              break;
            }
          }
          
          if(Max < count[i]){
            Max = count[i];
          }
          i += count[i];
        }
    
      for(int i = 0; i < N; i++){
          if(Max == count[i]){
            System.out.println(row[i]);
          }
        }
      
	}
}