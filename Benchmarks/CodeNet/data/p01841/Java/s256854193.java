import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		
		Node a = toNode(A);
		Node b = toNode(B);
		
		Node c = merge(a,b);
		
		System.out.println(toString(c));
		
	}
	static char[] S;
	static int id;
	public static Node toNode(String a) {
		S = a.toCharArray();
		id = 0;
		return N();
	}
	public static Node N() {
		Node node = new Node();
		if(S[id+1] != ')') {
			id++;
			node.l = N();
		}
		id += 3;
		String num = "";
		while(S[id] != ']') {
			num += S[id++];
		}
		node.number = Integer.parseInt(num);
		id++;
		if(S[id+1] != ')') {
			id++;
			node.r = N();
		}
		id++;
		return node;
			
	}
	public static Node merge(Node a, Node b) {
		Node next = new Node();
		next.number = a.number + b.number;
		if(a.l != null && b.l != null) {
			next.l = merge(a.l,b.l);
		}
		if(a.r != null && b.r != null) {
			next.r = merge(a.r,b.r);
		}
		return next;
	}
	public static String toString(Node a) {
		String ret = "(";
		if(a.l != null) {
			ret += toString(a.l);
		}
		ret += ")[" + a.number + "](";
		if(a.r != null) {
			ret += toString(a.r);
		}
		ret += ")";
		return ret;
	}
	static class Node {
		int number;
		Node l;
		Node r;
	}
}
	
	
		