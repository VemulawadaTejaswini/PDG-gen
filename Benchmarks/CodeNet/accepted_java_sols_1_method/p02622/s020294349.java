import java.io.*; 
import java.util.*; 
  
 class Main 
{ 
    public static void main(String args[]) 
    { 
      //  try{
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String t=sc.next();
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=t.charAt(i))
            c++;
        }
        System.out.println(c);
      //  }catch(Exception e)
      //  {
      //      return;
     //   }
    } 
} 