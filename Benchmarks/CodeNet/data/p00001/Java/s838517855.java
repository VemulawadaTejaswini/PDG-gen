import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

class Main{
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> m =  new ArrayList();

        for(int i=0;i<10;i++) {
        	m.add(Integer.valueOf(br.readLine()));
        }
        Collections.sort(m);
        Collections.reverse(m);

        for(int i=0;i<3;i++) {
            System.out.println(m.get(i));
        }
	}
}