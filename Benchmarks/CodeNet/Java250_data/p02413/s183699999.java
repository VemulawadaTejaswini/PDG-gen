
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		String first_line = input.readLine();

		// ?????°??¨?????°?????????
		String[] array_of_li_col = first_line.split(" ");

		// ?????°
		int line_r = Integer.parseInt(array_of_li_col[0]);

		// ?????°
		int column_c = Integer.parseInt(array_of_li_col[1]);
		// ??¨????????????????¬????????????????
		int graph_array[][] = new int[line_r][column_c];

		int column_sum = 0;

		int line_sum=0;

		int All_sum=0;

		// ??¨?????????????????¨?????¨??????????¨???????????????¨????????¨??????????¬??????????
		for (int line_spot = 0; line_spot < line_r; line_spot++) {


			String input_column = input.readLine();

			String[] array_of_column = input_column.split(" ");


			for (int column_spot = 0; column_spot < column_c; column_spot++) {

				int element_column = Integer.parseInt(array_of_column[column_spot]);

				graph_array[line_spot][column_spot] = element_column;

				column_sum+=graph_array[line_spot][column_spot] ;




				System.out.print(graph_array[line_spot][column_spot]+" ");
			}

			System.out.println(column_sum);
			All_sum+=column_sum;
			column_sum = 0;

		}

		for(int column_spot=0; column_spot<column_c; column_spot++){
			for(int line_spot = 0; line_spot < line_r; line_spot++){
				line_sum+=graph_array[line_spot][column_spot] ;
			}
			System.out.print(line_sum+" ");

			line_sum=0;
		}
		System.out.println(All_sum);

	}

}