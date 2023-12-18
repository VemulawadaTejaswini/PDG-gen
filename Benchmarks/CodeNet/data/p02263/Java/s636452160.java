import java.util.*;

public class Main {
	public static void main(String args[])
	{
	    Scanner sc = new Scanner(System.in);
	    String str = sc.nextLine();
        sc.close();

        String[] str_arr = str.split(" ");

	    Stack stack = new Stack(200);

	    int a;
	    int b;
	    for (String s : str_arr) {
            try {
                switch (s) {
                    case "+":
                        b = stack.pop();
                        a = stack.pop();
                        stack.push(a + b);
                        break;
                    case "-":
                        b = stack.pop();
                        a = stack.pop();
                        stack.push(a - b);
                        break;
                    case "*":
                        b = stack.pop();
                        a = stack.pop();
                        stack.push(a * b);
                        break;
                    default:
                        stack.push(Integer.parseInt(s));
                }
            } catch (Exception e) {
                System.out.println("error");
            }
	    }

        try {
            System.out.println(stack.pop());
        } catch (Exception e) {}

	}
}

class Stack
{
    public int top = 0;
    public int S[];

    public Stack(int n) {
        this.S = new int[n];
    }

    public void push(int x) throws Exception
    {
        if (this.isFull()) {
            throw new Exception();
        }
        this.S[++top] = x;
    }

    public int pop() throws Exception
    {
        if (this.isEmpty()) {
            throw new Exception();
        }
        this.top--;
        return S[this.top + 1];
    }

    private boolean isFull()
    {
        return this.top >= this.S.length - 1;
    }

    private boolean isEmpty()
    {
        return this.top == 0;
    }
}
