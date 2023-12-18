import java.util.*;
public class Main{
  	public static void main (String [] args){
     	Scanner sc = new Scanner (System.in);
      	int N = sc.nextInt();
      	int count = 0;
      	for (int i = 0; i <= N; i++){
          	if (i%2 != 0){
          		int factorCount = 0;
              	for (int j = 1; j <= i; j++){
                  	if (i%j==0) factorCount++;
                }
              	if (factorCount == 8) count++;
            }
        }
      	System.out.println(count);
    }
}