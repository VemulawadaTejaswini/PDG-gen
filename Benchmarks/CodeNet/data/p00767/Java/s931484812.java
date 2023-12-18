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
		ArrayList<Rect> rect = new ArrayList<Rect>();
		for(int i=1; i<=150-1; i++){
			for(int j=i+1; j<=150; j++){
				rect.add(new Rect(i, j));
			}
		}
		Collections.sort(rect);
		while(true){
			int h = in.nextInt();
			int w = in.nextInt();
			if(h == 0) break;
			Rect origin = new Rect(h, w);
			Rect r = null;
			for(Rect rt: rect){
				if(origin.compareTo(rt) < 0){
					r = rt;
					break;
				}
			}
			System.out.println(r.h+" "+r.w);
		}
		
	}
}

class Rect implements Comparable<Rect>{
	int tai;
	int hei;
	int h, w;
	public Rect(int h, int w){
		this.h = h;
		this.w = w;
		tai = h*h + w*w;
		hei = h;
	}
	
	@Override
	public int compareTo(Rect o) {
		if(tai != o.tai) return tai- o.tai;
		return hei- o.hei;
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