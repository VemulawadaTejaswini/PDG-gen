import java.util.Scanner;
public class Main
{
 	public static void main(String[] args)
    {
     	 Scanner sc = new Scanner(System.in);
      	String[] word = sc.nextLine().split(" ");
      	int[] num = new int[4];
      	for(int i = 0; i < 4; i++)
        {
         	num[i] = Integer.parseInt(word[i]); 
        }
      
      	int a = num[0] / num[3];
      	int b = num[2] / num[1];
      
      	if(num[0] % num[3] != 0)
        {
         	a++; 
        }
      
      	if(num[2] % num[1] != 0)
        {
         	b++; 
        }
      
      	if(a >= b)
        {
          	System.out.println("Yes");
        }else{
          	System.out.println("No");
        }
    }
}