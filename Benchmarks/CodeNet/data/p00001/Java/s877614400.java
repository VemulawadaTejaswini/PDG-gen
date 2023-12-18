import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Integer[] a =new Integer[10];    //?????????????????????

		System.out.println("?±±??????????????\????????????????????????");

		for(int i = 0; i < a.length; i++){
			a[i] = Integer.parseInt(br.readLine());
		}

		Arrays.sort(a,Collections.reverseOrder());

		for(int i = 0; i < 3; i++){
            System.out.println(a[i]);
        }

	}
}