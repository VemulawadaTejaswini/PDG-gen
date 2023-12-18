import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.BitSet;
import java.util.Comparator;
import java.util.HashSet;

public class Main {
	public static char[][] s;
	public static int alpnum;
	public static int[] alps;
	
	public static void main(String[] args) throws NumberFormatException,
	IOException {
		ContestScanner in = new ContestScanner();
		BitSet alp = new BitSet();
		while(true){
			alp.clear();
			int n = in.nextInt();
			if(n == 0) break;
			s = new char[n][];
			for(int i=0; i<n; i++){
				s[i] = in.nextToken().toCharArray();
				for(int j=0; j<s[i].length; j++){
					alp.set(s[i][j]-'A');
				}
			}
			count = 0;
			alpnum = alp.cardinality();
			alps = new int[alpnum];
			int idx = 0;
			for(int i=alp.nextSetBit(0); i!=-1; i=alp.nextSetBit(i+1)){
				alps[idx++] = i;
			}
			dfs(0);
			System.out.println(count);
		}
	}
	
	public static int count;
	public static int[] table = new int[26];
	public static void dfs(int status){
		int idx = Integer.bitCount(status);
		if(idx == alpnum){
			if(calc()){
//				System.out.println(out());
				count++;
			}
			return;
		}
		for(int i=0; i<10; i++){
			if((status&1<<i) > 0) continue;
			table[alps[idx]] = i;
			dfs(status|1<<i);
		}
	}
	
	public static boolean calc(){
		long left = 0;
		for(int i=0; i<s.length-1; i++){
			long val = calcStr(i);
			if(val < 0) return false;
			left += val;
		}
		return calcStr(s.length-1) == left;
	}
	
	public static long calcStr(int idx){
		long res = 0;
		if(s[idx].length > 1 && table[s[idx][0]-'A'] == 0) return -1;
		for(int i=0; i<s[idx].length; i++){
			res *= 10;
			res += table[s[idx][i]-'A'];
		}
		return res;
	}
	
	public static String out(){
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<s.length; i++){
			if(i==s.length-1) sb.append("+)---------\n");
			for(int j=0; j<10-s[i].length; j++){
				sb.append(" ");
			}
			for(int j=0; j<s[i].length; j++){
				sb.append(table[s[i][j]-'A']);
			}
			sb.append("\n");
		}
		return sb.toString();
	}
}

class Point{
	int x, y;
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}

class Node{
	int id;
	HashSet<Node> edge = new HashSet<Node>();
	public Node(int id) {
		this.id = id;
	}
	public void createEdge(Node node) {
		edge.add(node);
	}
}

class MyComp implements Comparator<int[]> {
	final int idx;
	public MyComp(int idx){
		this.idx = idx;
	}
	public int compare(int[] a, int[] b) {
		return a[idx] - b[idx];
	}
}

class Reverse implements Comparator<Integer> {
	public int compare(Integer arg0, Integer arg1) {
		return arg1 - arg0;
	}
}


class ContestWriter {
	private PrintWriter out;

	public ContestWriter(String filename) throws IOException {
		out = new PrintWriter(new BufferedWriter(new FileWriter(filename)));
	}

	public ContestWriter() throws IOException {
		out = new PrintWriter(System.out);
	}

	public void println(String str) {
		out.println(str);
	}

	public void print(String str) {
		out.print(str);
	}

	public void close() {
		out.close();
	}
}

class ContestScanner {
	private BufferedReader reader;
	private String[] line;
	private int idx;

	public ContestScanner() throws FileNotFoundException {
		reader = new BufferedReader(new InputStreamReader(System.in));
	}

	public ContestScanner(String filename) throws FileNotFoundException {
		reader = new BufferedReader(new InputStreamReader(new FileInputStream(
				filename)));
	}

	public String nextToken() throws IOException {
		if (line == null || line.length <= idx) {
			line = reader.readLine().trim().split(" ");
			idx = 0;
		}
		return line[idx++];
	}

	public long nextLong() throws IOException, NumberFormatException {
		return Long.parseLong(nextToken());
	}

	public int nextInt() throws NumberFormatException, IOException {
		return (int) nextLong();
	}

	public double nextDouble() throws NumberFormatException, IOException {
		return Double.parseDouble(nextToken());
	}
}