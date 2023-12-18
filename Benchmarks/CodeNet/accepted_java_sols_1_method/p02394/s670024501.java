import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
        	String[] input_string_array = br.readLine().split(" ");

        	final int ARRAY_SIZE = 5;
        	int[] input_int_array = new int[ARRAY_SIZE];

        	for (int i = 0; i < input_string_array.length; i++) {
        		input_int_array[i] = Integer.parseInt(input_string_array[i]);
        		}

        	int W = input_int_array[0];
        	int H = input_int_array[1];
        	int x = input_int_array[2];
        	int y = input_int_array[3];
        	int r = input_int_array[4];


        	if ((W - x) >= r && x >= r && (H - y) >= r && y >= r) {
        		System.out.println("Yes");
        		} else {
        		System.out.println("No");
        		}

        } catch (IOException e) {
        	e.printStackTrace();
        }
    }
}

