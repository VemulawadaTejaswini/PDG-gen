import java.io.*;
import java.util.*;
public class Main {
     public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer s = new StringTokenizer(br.readLine()," ");
	int[] input = new int[3];
	input[0] = Integer.parseInt(s.nextToken());
	input[1] = Integer.parseInt(s.nextToken());
	input[2] = Integer.parseInt(s.nextToken());

	for(int i=input.length;i==0;i--){
		for(int j=0;j<i;j++){
		if(input[j]>input[j+1]){
			String temp = input[j];
			input[j] = input[j+1];
			input[j+1] = temp;
			}
		}
	}
	System.out.println(input[0] + input[1] + input[2]);
    }
}