import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] array = br.readLine().split(" ");
        int a = Integer.parseInt(array[0]);
        int b = Integer.parseInt(array[1]);
        int d = a/b;
        int r = a%b;
        double f = (double)a/(double)b;
        System.out.println(d+" "+r+" "+f);
	}
}