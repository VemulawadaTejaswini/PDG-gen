import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		String first_line = input.readLine();

		// ??´??°n
		int num_n = Integer.parseInt(first_line);

		String secound_line = input.readLine();

		// 2???????????\???
		String[] vector_x_array = secound_line.split(" ");

		String third_line = input.readLine();

		// 3???????????\???
		String[] vector_y_array = third_line.split(" ");

		double p_first = 0;

		double p_secound_square = 0;

		double p_third_squar = 0;

		double p_secound = 0;
		
		double max=0;

		for (int array_spot = 0; array_spot < num_n; array_spot++) {

			double vector_x = Double.parseDouble(vector_x_array[array_spot]);

			double vector_y = Double.parseDouble(vector_y_array[array_spot]);

			
			
			double chebi=0;
			
			if (vector_x < vector_y) {

				double tum = vector_x;

				vector_x = vector_y;

				vector_y = tum;
			}

			chebi=vector_x - vector_y;
			
			p_first += vector_x - vector_y;
			
			if(max<chebi){
				
				max=chebi;
			}

			p_secound_square += Math.pow(vector_x - vector_y, 2);

			p_third_squar+=Math.pow(vector_x - vector_y, 3);
		}

		System.out.println(p_first);

		p_secound=Math.sqrt(p_secound_square);


		double p_third=Math.cbrt(p_third_squar);

		System.out.println(p_secound);

		System.out.println(p_third);
		
		System.out.println(max);

		
	}

}