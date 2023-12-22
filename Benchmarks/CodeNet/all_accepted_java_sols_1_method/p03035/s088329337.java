import java.util.Scanner;
 
public class Main
{
 
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
 
		int age = Integer.parseInt(sc.next());
 		int b = Integer.parseInt(sc.next());
		
      	if(age>=13){
          System.out.println(b);
        }else if(age<=5){
          System.out.println("0");
        }else{
          System.out.println(b/2);
        }
	}
}