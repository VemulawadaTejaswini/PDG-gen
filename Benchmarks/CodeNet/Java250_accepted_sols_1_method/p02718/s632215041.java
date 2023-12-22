import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
    {
     	 Scanner sc = new Scanner(System.in);
      	
     	String[] sep = sc.nextLine().split(" ");
      	int n = Integer.parseInt(sep[0]);
      	int m = Integer.parseInt(sep[1]);
      	int[] bigger = new int[n];
      	String[] sepa = sc.nextLine().split(" ");
      	int sumVote = 0;
      	for(int i = 0; i < n; i++)
        {
         	bigger[i] =  Integer.parseInt(sepa[i]);
          	sumVote += bigger[i];
        }
      	int judge = 0;
      	for(int i = 0; i < n; i++)
        {
          	int amari = sumVote % (4 * m);
            if(bigger[i] > sumVote / (4 * m))
            {
                  judge++;
            }else if(bigger[i] == sumVote / (4 * m) && sumVote % (4 * m) == 0){
             	 judge++;
            }
        }
      
      if(judge >= m)
      {
        	System.out.print("Yes");
      }else{
        	System.out.print("No");
      }
    }
}