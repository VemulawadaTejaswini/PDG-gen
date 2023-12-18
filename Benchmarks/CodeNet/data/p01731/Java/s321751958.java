import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.ArrayIndexOutOfBoundsException;
import java.math.BigInteger;

import javax.script.AbstractScriptEngine;


/**
 * @author yoshikyoto
 */
class Main{
	// public static Graph g;
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		HashMap<Integer, Node> map = new HashMap<Integer, Node>();
		Node root = null;
				
		for (int i = 1; i <= n; i++) {
			int k = Integer.parseInt(br.readLine());
			String m = br.readLine();
			Node node = new Node(m);
			
			// 親を持つ場合その親の子に追加
			if(k != 0){
				Node parent = map.get(k);
				parent.addChild(node);
				node.depth = parent.depth + 1;
			}else{
				root = node;
				node.depth = 0;
			}
			
			map.put(i, node);
		}
		root.print();
	}
}

class Node{
	ArrayList<Node> children = new ArrayList<Node>();
	String message;
	int depth;
	Node(String message){
		this.message = message;
	}
	public void addChild(Node n){
		children.add(n);
	}
	// 再帰的print
	public void print(){
		StringBuffer buf = new StringBuffer();
		for(int i = 0; i < depth; i++)
			buf.append('.');
		buf.append(message);
		System.out.println(buf.toString());
		
		for(int i = 0; i < children.size(); i++)
			children.get(i).print();
	}
}



// --- ここから下はライブラリ ----------
/**
 * MyUtil
 * @author yoshikyoto
 */
class MyUtil {
	public static int[] cp(int[] a){
		int[] b = new int[a.length];
		for(int i = 0; i < a.length; i++) b[i] = a[i];
		return b;
	}
	public static int toInt(boolean[] a){
		int pow = 1, ret = 0, l = a.length;
		for(int i = 0; i < l; i++){
			if(a[i]) ret += pow;
			pow *= 2;
		}
		return ret;
	}
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static int ins[];
	public static int[] readIntMap() throws IOException{return parseInt(readLine().split(" "));}
	public static int readIntMap(int i) throws Exception{
		if(i == 0) ins = readIntMap();
		return ins[i];
	}
	public static int[][] readIntMap(int n, int m) throws IOException{
		int[][] ret = new int[n][];
		for(int i = 0; i < n; i++) ret[i] = readIntMap();
		return ret;
	}
	public static int[] readIntToMap(int n) throws IOException{
		int[] ret = new int[n];
		for(int i = 0; i < n; i++) ret[i] = readInt();
		return ret;
	}
	public static int[] readNoDistIntMap() throws IOException{
		String[] strs = readLine().split("");
		int l = strs.length;
		int[] ret = new int[l-1];
		for(int i = 1; i < l; i++)
			ret[i-1] = parseInt(strs[i]);
		return ret;
	}
	public static String readLine() throws IOException{return br.readLine();}
	public static int readInt() throws IOException{return Integer.parseInt(br.readLine());}
	public static int[] parseInt(String[] arr){
		int[] res = new int[arr.length];
		for(int i = 0; i < arr.length; i++)res[i] = Integer.parseInt(arr[i]);
		return res;
	}
	public static double[] parseDouble(String[] arr){
		double[] res = new double[arr.length];
		for(int i = 0; i < arr.length; i++)res[i] = Double.parseDouble(arr[i]);
		return res;
	}
	public static boolean[] parseBool(String[] arr){
		int[] t = parseInt(arr);
		boolean[] res = new boolean[t.length];
		for(int i = 0; i < t.length; i++){
			if(t[i] == 1){res[i] = true;
			}else{res[i] = false;}
		}
		return res;
	}
	public static int parseInt(Object o){
		return Integer.parseInt(o.toString());
	}
}