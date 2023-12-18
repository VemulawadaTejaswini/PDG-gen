import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try {
		    Scanner sc = new Scanner(System.in);
		    String s,t;
		    int c,m,i,j;
		    s=sc.nextLine();
		    t=sc.nextLine();
		    m=2147483647;
		    c=0;
		    for(i=0;i<=(s.length()-t.length());i++)
		    {
		        c=0;
		      for(j=i;j<(i+t.length());j++)
		        {
		        if(s.charAt(j)!=t.charAt(j-i))
		          c++;
		        }
		       
		       if(c<m)
		        m=c;
		    }
		    System.out.println(m);
		    
		} catch(Exception e) {
		}
	}
}
