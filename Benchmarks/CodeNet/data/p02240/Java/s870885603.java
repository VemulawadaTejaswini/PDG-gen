import java.util.Scanner;
import java.util.ArrayList;
import java.util.Hashtable;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int nodes = input.nextInt();
		int connections = input.nextInt();
		Hashtable<Integer, ArrayList<Integer>> hash = new Hashtable<Integer, ArrayList<Integer>>();
		for(int i = 0; i < connections; i++) {
			int vertex = input.nextInt();
			int toVertex = input.nextInt();
			if(hash.containsKey(vertex)) {
				ArrayList<Integer> value = hash.get(vertex);
				value.add(toVertex);
				hash.put(vertex, value);
			}
			else {
				ArrayList<Integer> value = new ArrayList<Integer>();
				value.add(toVertex);
				hash.put(vertex, value);
			}
		}
		int tests = input.nextInt();
		int[][] testing = new int[tests][tests];
		for(int i = 0; i < tests; i++) {
			for(int j = 0; j < 2; j++) {
				testing[i][j] = input.nextInt();
			}
		}
		for(int i = 0; i < tests; i++) {
			viable(hash, testing[i][0], testing[i][1], new ArrayList<Integer>());
		}
	}
	public static void viable(Hashtable<Integer, ArrayList<Integer>> hash, int from, int to, ArrayList<Integer> checked) {
		boolean found = false;
		if(hash.get(from) != null) {
			checked.add(from);
			if(hash.get(from).contains(to)) {
				System.out.println("yes");
				found = true;
				return;
			}
			else {
				for(int i = 0; i < hash.get(from).size(); i++) {
					from = hash.get(from).get(i);
					viable(hash, from, to, checked);
				}
			}
		}else {
			System.out.println("no");
		}
	}
}
