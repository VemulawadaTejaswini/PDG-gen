import java.util.*;
class b
{
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  String s=sc.nextString();
  int count=0,j=0,k=0,g=0,m=0;
    for(int i=0;i<n;i++)
    {
      if(s=="AC")j++;
   else if(s=="WA")k++;
     else if(s=="TLE")g++;
      else m++;
    }
    System.out.println("AC x "+j);
     System.out.println("WA x "+k);
     System.out.println("TLE x "+g);
     System.out.println("RE x "+m);
}
    
    
    
