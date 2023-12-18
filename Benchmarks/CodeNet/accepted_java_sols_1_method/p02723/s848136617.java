import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
    {
     	Scanner sc = new Scanner(System.in); 
      
      	String[] words = sc.nextLine().split("");
      	
      	if(words[2].equals(words[3]) && words[4].equals(words[5]))
        {
          	System.out.println("Yes");
        }else{
          System.out.println("No");
        }
    }
}