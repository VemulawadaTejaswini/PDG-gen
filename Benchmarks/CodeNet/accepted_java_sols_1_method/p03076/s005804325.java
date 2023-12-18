import java.util.*;
public class Main{
  public static void main(String[] args){
   	Scanner sc = new Scanner(System.in);
 
    int Na = sc.nextInt();
    int Nb = sc.nextInt();
    int Nc = sc.nextInt();
    int Nd = sc.nextInt();
    int Ne = sc.nextInt();
    
    int count = 0;
    int[] N1 = new int[5];
    N1[0] = Na%10;
    N1[1] = Nb%10;
    N1[2] = Nc%10;
    N1[3] = Nd%10;
    N1[4] = Ne%10;
    
    int sum = Na-N1[0]+Nb-N1[1]+Nc-N1[2]+Nd-N1[3]+Ne-N1[4]+40;
    
    Arrays.sort(N1);
    int min = 0;
    for(int i = 0; i<5;i++)
    {
    	if(N1[i] == 0) count++;
      	else 
        {
          min = N1[i];
          break;
        }
    }
    if(count == 5) count = 4;
   	System.out.println(sum - 10 * count +min);
 }
}