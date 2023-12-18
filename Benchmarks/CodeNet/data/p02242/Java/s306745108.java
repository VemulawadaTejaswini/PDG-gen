import java.util.Scanner;


public class Main{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int edgeCnt = Integer.parseInt(s.nextLine());
		int[][] input = new int[edgeCnt][];
		for(int i=0 ; i<edgeCnt ; i++) {
			String[] tmp = s.nextLine().split(" ");
			int[] inner = new int[edgeCnt];
			for(int j=0 ; j<edgeCnt ; j++) {
				inner[j] = -1;
			}
			for(int k=0 ; k<Integer.parseInt(tmp[1]) ; k++) {
				inner[Integer.parseInt(tmp[k*2+2])] = Integer.parseInt(tmp[k*2+3]);
			}
			input[Integer.parseInt(tmp[0])] = inner;
		}
		int[] result = solve(input);
		for(int a=0 ; a<result.length ; a++) {
			System.out.println(a + " " + result[a]);
		}
	}

	public static int[] solve(int[][] input) {
		int[] result = new int[input.length];
		for(int i=0 ; i<input.length ; i++) {
			result[i] = Integer.MAX_VALUE;
		}
		result[0] = 0;
		boolean[] alreadyVisit = new boolean[input.length];
		int minValue = Integer.MAX_VALUE;
		int minEdge = -1;
		while(true) {
			minEdge = -1;
			minValue = Integer.MAX_VALUE;
			for(int j=0 ; j<input.length ; j++) {
				if(minValue>result[j] && !alreadyVisit[j]) {
					minValue = result[j];
					minEdge = j;
				}
			}
			if(minEdge==-1)
				break;
			alreadyVisit[minEdge] = true;
			for(int k=0 ; k<input[minEdge].length ; k++) {
				if(input[minEdge][k] != -1) {
					if(result[k]>result[minEdge]+input[minEdge][k]) {
						result[k] = result[minEdge]+input[minEdge][k];
					}
				}
			}
		}
		return result;
	}

}