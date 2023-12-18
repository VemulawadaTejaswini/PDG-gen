import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		final int test_num = 3;
		int[] score = new int[test_num];

		while(true){

			String[] token = br.readLine().split(" ");

			for(int i = 0; i < test_num; i++){
				score[i] = Integer.parseInt(token[i]);
			}

			int total_score = score[0] + score[1];

			if(score[0] == -1 && score[1] == -1 && score[2] == -1){
				break;
			}

			if(score[0] == -1 || score[1] == -1 || total_score < 30){
				sb.append("F");
			}else if(total_score >= 30 && total_score < 50){

				if(score[2] < 50){
					sb.append("D");
				}else{
					sb.append("C");
				}

			}else if(total_score >= 50 && total_score < 65){
				sb.append("C");
			}else if(total_score >=65 && total_score < 80){
				sb.append("B");
			}else if(total_score >= 80){
				sb.append("A");
			}

			sb.append("\n");

		}

		System.out.print(sb);

	}
}