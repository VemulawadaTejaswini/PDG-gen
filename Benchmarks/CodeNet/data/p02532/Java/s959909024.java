import java.util.Scanner;

class Stack{
	private char[] c;
	private int p;
	public Stack(){
		p = 0;
		c = new char[1000];
	}
	public void Push( char ch ){
		c[p] = ch;
		p++;
	}
	public char Pop(){
		p--;
		return c[p];
	}
}

class Main{
	public static void main( String[] args ){
		Scanner stdin = new Scanner( System.in );
		int n = stdin.nextInt();
		Stack[] mounts = new Stack[n];
		for( int i=0; i<n; i++ ){
			mounts[i] = new Stack();
		}
		String command = stdin.next();
		while( !command.equals("quit") ){
			if( command.equals("push") ){
				int num = stdin.nextInt()-1;
				command = stdin.next();
				char ch = command.charAt(0);
				mounts[num].Push(ch);
			}
			else if( command.equals("pop") ){
				int num = stdin.nextInt()-1;
				System.out.println(mounts[num].Pop());
			}
			else if( command.equals("move") ){
				int src = stdin.nextInt()-1;
				int dst = stdin.nextInt()-1;
				char ch = mounts[src].Pop();
				mounts[dst].Push(ch);
			}
			command = stdin.next();
		}
	}
}