import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] firstLine = s.nextLine().split(" ");
		int vertexCnt = Integer.parseInt(firstLine[0]);
		int edgeCnt = Integer.parseInt(firstLine[1]);
		ArrayList<Integer>[] input = new ArrayList[vertexCnt];
		for(int j=0 ; j<vertexCnt ; j++) {
			input[j] = new ArrayList<Integer>();
		}
		int[] inputEdgeCnt = new int[vertexCnt];
		for(int i=0 ; i<vertexCnt ; i++) {
			String[] line = s.nextLine().split(" ");
			int start = Integer.parseInt(line[0]);
			int end = Integer.parseInt(line[1]);
			input[start].add(new Integer(end));
			inputEdgeCnt[end]++;
		}
		ArrayList result = solve(input, inputEdgeCnt);
		Object[] list = result.toArray();
		for(int i=0 ; i<list.length ; i++) {
			System.out.println(list[i]);
		}
	}

	public static ArrayList solve(ArrayList[] input, int[] inputEdgeCnt) {
		boolean[] already = new boolean[input.length];
		int index = 0 ;
		LinkedList<Integer> queue = new LinkedList<Integer>();
		ArrayList<Integer> result = new ArrayList<Integer>();
		outter : while(true) {
			inner : for(int i=0 ; i<already.length ; i++) {
				if(already[i] == false) {
					break inner;
				}
				if(i+1 == already.length)
					break outter;
			}

			if(inputEdgeCnt[index]==0 && !already[index]) {
				Object[] list = input[index].toArray();
				for(int a=0 ; a<list.length ; a++) {
					queue.offer((Integer) list[a]);
				}
				already[index] = true;
				result.add(new Integer(index));
			}
			index++;
			while(!queue.isEmpty()) {
				Integer neig = (Integer) queue.poll();
				inputEdgeCnt[neig.intValue()]--;
				if(inputEdgeCnt[neig.intValue()] == 0 && !already[neig.intValue()]) {
					Object[] list = input[neig.intValue()].toArray();
					for(int a=0 ; a<list.length ; a++) {
						queue.offer((Integer) list[a]);
					}
					already[neig.intValue()] = true;
					result.add(new Integer(neig.intValue()));
				}
			}
		}
		return result;
	}

}