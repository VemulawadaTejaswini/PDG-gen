import java.util.LinkedList;
import java.util.Scanner;


public class Main{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int cnt = Integer.parseInt(s.nextLine());
		int[][] input = new int[cnt][cnt+2];
		for(int i=0 ; i<cnt ; i++) {
			String[] tmp = s.nextLine().split(" ");
			int[] a = new int[tmp.length];
			for(int j=0 ; j<a.length ; j++) {
				a[j] = Integer.parseInt(tmp[j]);
			}
			input[i] = a;
		}
		int[] result = bfs(input);
		for(int i=0 ; i<result.length ; i++) {
			System.out.println((i+1) + " " + result[i]);
		}
	}

	public static int[] bfs(int[][] input) {
		int[] result = new int[input.length];
		boolean[] alreadyVisit = new boolean[input.length];
		for(int i=0 ; i<result.length ; i++) {
			result[i] = -1;
			alreadyVisit[i] = false;
		}
		LinkedList<Integer> graph = new LinkedList<Integer>();
		LinkedList<Integer> shortPath = new LinkedList<Integer>();
		graph.offer(new Integer(1));
		shortPath.offer(new Integer(0));

		while(! graph.isEmpty()) {
			Integer g = (Integer) graph.poll();
			Integer s = (Integer) shortPath.poll();
			if(alreadyVisit[g.intValue()-1])
				break;
			alreadyVisit[g.intValue()-1] = true;
			if(result[g.intValue()-1]==-1)
				result[g.intValue()-1] = s.intValue();
			for(int i=0 ; i<input[g.intValue()-1][1] ; i++) {
				graph.offer(new Integer(input[g.intValue()-1][i+2]));
				shortPath.offer(new Integer(s.intValue()+1));
			}
		}
		return result;
	}
}