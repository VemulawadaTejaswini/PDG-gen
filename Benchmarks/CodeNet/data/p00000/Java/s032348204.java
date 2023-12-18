import java.util.*;

public class main {

    public static Scanner in;
 
    public static void main(String[] args) 
	{
        in = new Scanner(System.in);

        doStuff();
    }

    public static void doStuff() 
	{
        for(int i = 1; i <= 9; i++)
		{
			for(int j = 1; j <= 9; j++)
			{
				System.out.format("%dx%d=%d\n", i, j, i * j);
			}
		}
    }

    public static void solve() 
	{
    
    }
}