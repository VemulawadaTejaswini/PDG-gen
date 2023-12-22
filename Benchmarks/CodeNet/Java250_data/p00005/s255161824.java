import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException {
		// System.out.println("Hello world");
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);

		while(true){
		
		int n = 2;
		String c = br.readLine();
		
		if(c == null)
			break;
		
		long[] arr = new long[n];
		for(int i = 0; i < n; i++){
		if(c.indexOf(" ") !=  -1){
		String str = c.substring(0, c.indexOf(" "));
		arr[i] = Long.parseLong(str);
		c = c.substring(c.indexOf(" ") + 1);
		}
		else{
		arr[i] = Long.parseLong(c);
		}
		}

		if(arr[1] < arr[0]){
			long re = arr[1];
			arr[1] = arr[0];
			arr[0] = re;
		}
		
		long[] arr2 = arr.clone();
		long amari = 1;
		while(arr2[0] !=0){
			amari = arr2[1] % arr2[0];
			if(amari == 0) break;
			arr2[1] = arr2[0];
			arr2[0] = amari;
		}
		


		long i = 1;
		while((arr[0]*i) % arr[1] != 0){
			i++;
		}
		
		System.out.println(arr2[0] + " " + arr[0]*i);
		
		}
	}

}