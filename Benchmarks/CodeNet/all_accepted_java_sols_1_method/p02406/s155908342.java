import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws  IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
      	int x = Integer.parseInt(br.readLine());
      	
      	for (int i = 3; i <= x; i++) {
        	if(i % 3 == 0) {
              sb.append(" " + i);
            } else {
                for (int j = i; j > 0; j /= 10) {
                    if (j % 10 == 3) {
                        sb.append(" " + i);
                        break;
                    }
                }
            }
      	}
      	System.out.print(sb + "\n");
    }
}
