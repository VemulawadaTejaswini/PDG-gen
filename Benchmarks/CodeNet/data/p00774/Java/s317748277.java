import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
	public static int[][] map;
	public static int w;
	public static int h;
	public static void main(String[] args) throws NumberFormatException,
	IOException {
		ContestScanner in = new ContestScanner();
		w = 5;
		while(true){
			h = in.nextInt();
			int score = 0;
			map = new int[h][w];
			for(int i=0; i<h; i++){
				for(int j=0; j<w; j++){
					map[i][j] = in.nextInt();
				}
			}
			int sc;
			while((sc = calcScore()) > 0){
				score += sc;
				nextState();
			}
			System.out.println(score);
		}
	}
	
	public static int calcScore(){
		// ?????????????????¢????¨???????????¶?????????????0??????????????????
		int res = 0;
		for(int i=0; i<h; i++){
			int cnt = 1;
			for(int j=1; j<=w; j++){
				if(j != w && map[i][j] == map[i][j-1]){
					cnt++;
					continue;
				}
				if(cnt < 3){
					cnt = 1;
					continue;
				}
				int num = map[i][j-1];
				if(num == 0){
					cnt = 0;
					continue;
				}
				int id = j-1;
				while(id >= 0 && map[i][id] == num){
					res += num;
					map[i][id] = 0;
					id--;
				}
				cnt = 0;
			}
		}
		return res;
	}
	
	public static void nextState(){
		// 0??????????¶??????????????????¨???
		int[][] nmap = new int[h][w];
		for(int i=0; i<w; i++){
			Deque<Integer> qu = new LinkedList<Integer>();
			for(int j=h-1; j>=0; j--){
				if(map[j][i] > 0) qu.add(map[j][i]);
			}
			int id = h-1;
			while(!qu.isEmpty()){
				nmap[id--][i] = qu.pollFirst();
			}
		}
		map = nmap;
	}
	
	public static String dump(int[][] map){
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<h; i++){
			for(int j=0; j<w; j++){
				sb.append(map[i][j]+" ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}
}

class Node{
	int id;
	int sink;
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