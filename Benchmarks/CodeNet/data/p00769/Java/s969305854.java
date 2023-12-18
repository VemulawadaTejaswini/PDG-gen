import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) throws NumberFormatException,
	IOException {
		ContestScanner in = new ContestScanner();
		int n = in.nextInt();
		for(int test=0; test<n; test++){
			char[] line = in.nextToken().toCharArray();
			State.init();
			State state = new State(line);
//			System.out.println(state);
			state.culc();
			System.out.println(state.need);
		}
	}
	
}

class State implements Comparable<State>{
	// 選挙区情報
	ArrayList<State> state = new ArrayList<State>();
	int num;
	int need; // この選挙区で勝つために必要な票数の最小値
	static int idx = 0;
	public State(char[] line){
		parser(line);
	}
	
	public State(int num){
		this.num = num;
	}
	
	public static void init(){
		idx = 0;
	}
	
	public void parser(char[] line){
		if(idx == line.length) return;
		idx++;// [を飛ばす
		if(line[idx] == '['){
			while(line[idx] == '['){
				state.add(new State(line));
			}
		}else{
			int val = 0;
			while('0' <= line[idx] && line[idx] <= '9'){
				val *= 10;
				val += line[idx]-'0';
				idx++;
			}
			num = val;
		}
		idx++; // ]を飛ばす
	}
	
	public void culc(){
		if(num != 0){
			need = (num+1)/2;
			return;
		}
		for(State st: state) st.culc();
		Collections.sort(state);
		for(int i=0; i<=state.size()/2; i++){
			need += state.get(i).need;
		}
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		if(num == 0){
			for(State st: state){
				sb.append(st.toString());
			}
		}else sb.append(num);
		sb.append("]");
		return sb.toString();
	}
	
	@Override
	public int compareTo(State o) {
		return need - o.need;
	}
}

class Node{
	int id;
	ArrayList<Node> edge = new ArrayList<Node>();
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
	
	public void println(Object obj) {
		out.println(obj);
	}

	public void print(String str) {
		out.print(str);
	}
	
	public void print(Object obj) {
		out.print(obj);
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
	
	public String readLine() throws IOException{
		return reader.readLine();
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