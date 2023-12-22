import java.util.*;
 
	public class Main {
		public static void main(String[] args) {
      	Scanner sc = new Scanner(System.in);
      
      	int N  =sc.nextInt();
       	int M  =sc.nextInt();
          
          List<Integer> n = new ArrayList<>();
          
          for(int i=0; i<N; i++){
          n.add(sc.nextInt());
          }

          double sum = 0;
          for(int i=0; i<N; i++){
          sum += n.get(i);
          }
 
          double a = sum/(4*M);
          int count = 0;
          for(int i=0; i<N; i++){
            if(n.get(i)>=a){
            count++;
            }
           
          }
          if(M<=count){
          System.out.println("Yes");
          }
          else{
          System.out.println("No");
          }
        }
    }
