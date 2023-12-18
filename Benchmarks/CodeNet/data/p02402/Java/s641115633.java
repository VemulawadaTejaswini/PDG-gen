import java.io.*;

class Main{

    public static void main(String[] args)throws IOException{

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int sum = 0;
	
	String tmp = br.readLine();
	int n = Integer.parseInt(tmp);
	
	tmp = br.readLine();
	String[] input = tmp.split(" ");
	
	int[] data = new int[n];
	for(int i = 0; i < n; i++){
	    data[i] = Integer.parseInt(input[i]);
	    sum += data[i];
	}

	for(int i = 0; i < n - 1; i++){
	    for(int j = n - 1; j > i; j--){
		if(data[j - 1] > data[j]){
		    int temp = data[j - 1];
		    data[j - 1] = data[j];
		    data[j] = temp;
		}
	    }
	}

	System.out.printf("%d %d %d\n", data[0], data[n - 1], sum);
	
    }

}