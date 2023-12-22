import java.util.Scanner;
public class Main
{
 	public static void main(String[] args)
    {
     	 Scanner sc = new Scanner(System.in);
      	int a = Integer.parseInt(sc.nextLine());
      	int b[] = new int[4]; 
      	for(int i = 0; i < a; i++)
        {	
          	String word = sc.nextLine();
         	if(word.equals("AC")) 
            {
              b[0]++;
            }else if(word.equals("TLE")){
              b[2]++;
            }else if(word.equals("WA")){
              b[1]++;
            }else{
              b[3]++;
            }
              
        }
      	System.out.println("AC x " + b[0]);
      	System.out.println("WA x " + b[1]);
      	System.out.println("TLE x " + b[2]);
      	System.out.println("RE x " + b[3]);
    }
}