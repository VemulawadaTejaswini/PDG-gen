import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.junit.Test;

public class Main {

	public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line = br.readLine();
			new Main().solution(Integer.parseInt(line));
        }
    }
	
	private void solution(int inputNum){
		int ans = inputNum * inputNum * inputNum;
		System.out.println(ans);
	}

}