import java.io.*;
import java.util.ArrayList;
class Main{
	public static void main(String[] args) throws IOException {
		int i,j,m;
		ArrayList<String> str = new ArrayList<>();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		m = Integer.parseInt(in.readLine());
        for(i=0;i<m;i++){
            str.add(in.readLine());
        }
        for (i = 1; i < 14; i++) {
            if (str.contains("S " + i) == false) {
                System.out.println("S " + i);
            }
        }
        for (i = 1; i < 14; i++) {
            if (str.contains("H " + i) == false) {
                System.out.println("H " + i);
            }
        }
        for (i = 1; i < 14; i++) {
            if (str.contains("C " + i) == false) {
                System.out.println("C " + i);
            }
        }
        for (i = 1; i < 14; i++) {
            if (str.contains("D " + i) == false) {
                System.out.println("D " + i);
            }
       }
		System.out.flush();
	}
}