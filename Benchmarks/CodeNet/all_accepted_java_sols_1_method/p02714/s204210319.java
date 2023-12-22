import java.util.Scanner;
public class Main
{
  	public static void main(String[] args)
    {
     	Scanner sc = new Scanner(System.in);
      	int a = Integer.parseInt(sc.nextLine());
      	String[] word = sc.nextLine().split("");
      	long count[] = new long[3];
      	long discount = 0L;
      	for(int i = 0; i < a; i++)
        {
         	if(word[i].equals("R"))
            {
              	count[0]++;
            }else if(word[i].equals("G")){
              	count[1]++;
            }else{
              	count[2]++;
            }
        }
      
      	for(int i = 0; i < a - 2; i++)
        {
         	for(int j = 1; (i + 2 * j) < a; j++)
            {
             	if(!word[i].equals(word[i + j]) && !word[i].equals(word[i + j * 2]) && !word[i + j].equals(word[i + j * 2])){
                  	discount++;
                }
            }
        }
      
      	
      	
      
      
      	System.out.println(count[0] * count[1] * count[2] - discount);
    }
}