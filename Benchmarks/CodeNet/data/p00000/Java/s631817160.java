import java.io.IOException;
import java.io.OutputStream;

public class Main{
	public static void main(String[] args)throws IOException{
		Print p = new Print();
		
		for(int i = 1; i <= 9; i++){
			for(int j = 1; j <= 9; j++){
				p.print((i + "x" + j + "=" + i * j + "\n").getBytes());
			}
		}
		p.close();
	}
}

class Print{
	private final OutputStream op = System.out;
	
	public void print(byte buffer[])throws IOException{
		op.write(buffer);
		op.flush();
	}
	public void close()throws IOException{
		op.close();
	}
}