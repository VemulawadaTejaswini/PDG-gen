import java.util.*;

public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    String s = sc.next ();
    String result = "Yes";

    for (int i = 0; i < s.length (); i++)
      {
	if (s.charAt (i) == 'U' || s.charAt (i) == 'D')
	  {
	    continue;
	  }
	else
	  {
	    if (i % 2 == 0)
	      {
		if (s.charAt (i) == 'R')
		  {
		    continue;
		  }
		else
		  {
		    result = "No";
		    break;
		  }
	      }
	    else
	      {
		if (s.charAt (i) == 'L')
		  {
		    continue;
		  }
		else
		  {
		    result = "No";
		    break;
		  }
	      }

	  }
      }


    System.out.println (result);
  }
}