import java.io.DataInputStream;
import java.io.IOException;

class Main {

	public static void main(String[] args) throws IOException {
        DataInputStream d = new DataInputStream(System.in);
        int x = d.read();
        System.out.println(x*x*x);
        
	}

}