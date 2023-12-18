import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		String input_line = input.readLine();

		String[] coordinate_group = input_line.split(" ");

		double coordinate_x = Double .parseDouble(coordinate_group[0]);

		double coordinate_y = Double .parseDouble(coordinate_group[1]);

		double coordinate_xi = Double .parseDouble(coordinate_group[2]);

		double coordinate_yi = Double .parseDouble(coordinate_group[3]);

		double x_distance = Math.pow(coordinate_x - coordinate_xi, 2);

		double y_distance = Math.pow(coordinate_y - coordinate_yi, 2);

		double distance = Math.sqrt(x_distance + y_distance);

		System.out.println(distance);

	}

}