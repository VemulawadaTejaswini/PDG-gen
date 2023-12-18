import java.util.Scanner;


public class Main{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] firstLine = s.nextLine().split(" ");
		int vertexCnt = Integer.parseInt(firstLine[0]);
		int edgeCnt = Integer.parseInt(firstLine[1]);
		int[][] input = new int[vertexCnt][vertexCnt];
		for(int j=0 ; j<vertexCnt ; j++) {
			for(int k=0 ; k<vertexCnt ; k++) {
				if(j==k) {
					input[j][k] = 0;
				}else {
					input[j][k] = Integer.MAX_VALUE;
				}
			}
		}
		for(int i= 0 ; i<edgeCnt ; i++) {
			String[] line = s.nextLine().split(" ");
			input[Integer.parseInt(line[0])][Integer.parseInt(line[1])] = Integer.parseInt(line[2]);
		}
		int[][] result = solve(input);
		for(int l=0 ; l<vertexCnt ; l++) {
			if(result[l][l] < 0) {
				System.out.println("NEGATIVE CYCLE");
				return;
			}
		}
		for(int a=0 ; a<result.length ; a++) {
			String str = "";
			for(int b=0 ; b<result.length ; b++) {
				if(result[a][b]==Integer.MAX_VALUE) {
					str = str + "INF ";
				}else {
					str = str + result[a][b] + " ";
				}
			}
			System.out.println(str.trim());
		}

	}

	public static int[][] solve(int[][] input) {
		int[][] result = new int[input.length][input.length];
		for(int i=0 ; i<input.length ; i++) {
			for(int j=0 ; j<input.length ; j++) {
				for(int k=0 ; k<input.length ; k++) {
					if(input[j][i]!=Integer.MAX_VALUE && input[i][k]!=Integer.MAX_VALUE)
						input[j][k] = Math.min(input[j][k], input[j][i] + input[i][k]);
				}
			}
		}
		return input;
	}

}