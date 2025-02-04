import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		byte min, count = 0, arrayLength = Byte.parseByte(in.readLine());
		byte[] array = new byte[arrayLength];
		String[] strData = in.readLine().split(" ");
		for (int i = 0; i < arrayLength; i++) {
			array[i] = Byte.parseByte(strData[i]);
		}
		for (byte x = 0; x < arrayLength; x++) {
			min = x;
			for (byte y = (byte) (x + 1); y < arrayLength; y++) {
				if (array[min] > array[y]) {
					min = y;
				}
			}
			if (array[x] > array[min]) {
				byte temp = array[x];
				array[x] = array[min];
				array[min] = temp; 
				count++;
			}
		}
		for (int j = 0; j < arrayLength; j++) {
			if (j == arrayLength - 1) {
				sb.append(array[j]);
			} else {
				sb.append(array[j] + " ");
			}
		}
		System.out.println(sb);
		System.out.println(count);
	}
}