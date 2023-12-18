import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
      	long b = sc.nextInt();
      	long c = sc.nextInt();
      	long d = sc.nextInt();
      	
      	long result[] = new long[4];
      	result[0] = a*c;
      	result[1] = a*d;
      	result[2] = b*c;
      	result[3] = b*d;
      
      	for(int i = 1;i < 4;i++){
         if(result[0] < result[i]){
         	result[0] = result[i];
         }
        }
      
      	System.out.print(result[0]);
    }
}