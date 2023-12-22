import java.util.Stack;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main
{
    public static void main(String[] args)throws IOException
    {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] S = br.readLine().split("\\s");

	Stack <Integer>s1 = new Stack<Integer>();
	int a = 0;
int b = 0;

	for(int i = 0; i < S.length; i++)
	    {
		switch(S[i])
		    {
		    case "+":
			a = s1.pop();
			b = s1.pop();
			s1.add(a + b);
			continue;

		    case "-":
			a = s1.pop();
			b = s1.pop();
			s1.add(b - a);
			continue;

		    case "*":
			a = s1.pop();
			b = s1.pop();
			s1.add(a * b);
			continue;
		    }
		s1.push(Integer.parseInt(S[i]));
	    }
	System.out.println(s1.pop());
    }
}