import java.util.Scanner;

public class Main
{
	private static class Node
	{
		public Node l, r;
		public Node(Node l_, Node r_) { l = l_; r = r_; }
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		for(;sc.hasNext();)
		{
			char type = sc.next().charAt(0);
			String x = sc.next();
			String y = sc.next();
			
			pos = 0;
			Node nx = makeNode(x);
			
			pos = 0;
			Node ny = makeNode(y);
			
			System.out.println(toString(type == 'u' ? union(nx, ny) : intersect(nx, ny)));
		}
	}
	
	private static int pos;
	private static Node makeNode(String s)
	{
		Node node = new Node(null, null);
		
		if (s.charAt(pos) == '(') pos++;
		
		if (s.charAt(pos) == '(')
		{
			node.l = makeNode(s);
		}
		
		if (s.charAt(pos) == ',') pos++;
		
		if (s.charAt(pos) == '(')
		{
			node.r = makeNode(s);
		}
		
		if (s.charAt(pos) == ')') pos++;
		
		return node;
	}
	
	private static Node union(Node x, Node y)
	{
		if (x == null)
		{
			return y;
		}
		else if (y == null)
		{
			return x;
		}
		return new Node(union(x.l, y.l), union(x.r, y.r));
	}
	
	private static Node intersect(Node x, Node y)
	{
		if (x == null || y == null)
		{
			return null;
		}
		return new Node(intersect(x.l, y.l), intersect(x.r, y.r));
	}
	
	private static String toString(Node node)
	{
		return node == null ? "" : "(" + toString(node.l) + "," + toString(node.r) + ")";
	}
}