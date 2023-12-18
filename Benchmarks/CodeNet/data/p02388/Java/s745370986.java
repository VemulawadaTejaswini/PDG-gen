import java.io,*

class Main {
	public static void main (String[] args) throws IOException{

	Buffered reader br = new Bufferedreader(new InputStreamReader(System.in));

		String str = br.readLine();
		int a = parseInt(str);

		System.out.print(a * a * a);
		}

	}

	