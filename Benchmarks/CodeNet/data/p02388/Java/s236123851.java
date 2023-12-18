import java.io.DataInputStream;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		System.out.println(Math.pow(new DataInputStream(System.in).readInt(), 3));
	}

}