import java.io.*;
import java.util.*;

public class Main{
	public static void main(String args[]){
		try{
			new Main();
		}catch(IOException e){
			e.printStackTrace();
		}
	}

	public double[] range = new double[]{
			165.0, 170.0, 175.0, 180.0, 185.0
	};

	public Main() throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int[] score = new int[]{0, 0, 0, 0, 0, 0};
		String line = in.readLine();
		int size = Integer.parseInt(line);

		for(int i=0; i<size; i++){
			line = in.readLine();
			double tall = Double.parseDouble(line);
			for(int n=0; n<5; n++){
				if(tall < range[n]){
					score[n]++;
					break;
				}
			}

			if(tall >= range[4]){
				score[5]++;
			}
		}

		for(int i=0; i<6; i++){
			System.out.printf("%d:", i+1);
			for(int n=0; n<score[i]; n++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}