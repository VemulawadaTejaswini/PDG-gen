public class Main {
	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    String line = br.readLine();
	    int x = Integer.parseInt(line.split(" ")[0]);
	    int y = Integer.parseInt(line.split(" ")[1]);

	    int area = x * y;
	    int len = (x + y) * 2;

	    System.out.println(area + " " + len);
	}
}