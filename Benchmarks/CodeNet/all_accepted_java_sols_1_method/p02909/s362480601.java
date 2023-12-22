import java.util.Scanner;

public class Main {
static Scanner reader =new Scanner (System.in);
  
    public static void main(String[] args) {
        String arr[]={"Sunny","Cloudy","Rainy" };
        int an=0;
         String s=reader.nextLine();
         for(int i=0;i<3;i++)
         {
             if(s.equals(arr[i]))
             {
                an = i + 1;
	        an %= 3;
				
                 break;
             }
         }
         System.out.println(arr[an]);
    }
    
}