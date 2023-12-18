import java.util.*;

class Main
{
    public static void main(String args[])
    {
        
        Scanner sc = new Scanner(System.in);
      String line=sc.next();
        
        String[] Array= line.split("");
        
        for(int i=0; i<Array.length;i++)
        {
            if(Array[i].equals("?"))
            {
                Array[i]="D";
            }
            System.out.print(Array[i]);
        }
    }
}
            