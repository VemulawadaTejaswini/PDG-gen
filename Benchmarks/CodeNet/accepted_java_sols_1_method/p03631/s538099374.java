import java.util.Scanner;
class Main 
{
  public static void main(String[] args) 
  {
    Scanner input=new Scanner(System.in);
    int num=input.nextInt();
        if(num>=100 && num<=999)
        {
          String temp=""+num;
          if((temp.length()%2==0))
          {
            System.out.println("No");
            
          }else
          {
            int counter=0;
            for(int k=0;k<(temp.length()/2);k++)
            {
              int temp2=temp.length()-1-k;
              if(temp.charAt(k)==temp.charAt(temp2))
              {
                counter++;
              }
            }
            if(counter==(temp.length()/2))
            {
              System.out.println("Yes");
            }else
            System.out.println("No");
          }
          
        }
  }
}