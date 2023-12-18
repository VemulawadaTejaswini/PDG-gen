import java.util.*;

class Main
{
    public static void main(String args[])
    {
	Scanner sc = new Scanner(System.in);
	String com,color;
	ArrayList<String> stack = new ArrayList<String>();

	while(true)
	    {
		com = sc.next();
		
		if(com.equals("push"))
		    {
			color = sc.next();
			stack.add(color);
		    }
		else if(com.equals("pop"))
		    {
			System.out.println(stack.get(stack.size() - 1));
			stack.remove(stack.size() - 1);
		    }
		else if(com.equals("quit"))
		    {
			break;
		    }
	    }
    }
}