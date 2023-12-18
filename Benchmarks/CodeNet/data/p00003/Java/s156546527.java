import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String num1 = br.readLine();

		StringBuilder bf = new StringBuilder();

		int[] num = new int[3];

		for(int i=0; i<Integer.parseInt(num1);i++){


		String[] str = br.readLine().split(" ");

		for(int k=0; k<3; k++){
			num[k] = Integer.parseInt(str[k]);
		}

		Arrays.sort(num);


		if(num[2]*num[2] == (num[1]*num[1])+(num[0]*num[0])){
			bf.append("YES").append("\n");
		}else {
			bf.append("NO").append("\n");

		}

		}

		System.out.print(bf);


	}

}