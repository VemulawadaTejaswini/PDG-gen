import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		try {
			String line;
			int n;
			
			while((line=r.readLine()).indexOf('0')<0){
				n = Integer.parseInt(line);
				int[][] m = new int[n][n];
				int[] shortindex = new int[n];//index of the shortest student in each row 
				Boolean[][] hands = new Boolean[n][n];
				
				//create matrix
				for(int row=0;row<n;row++){
					line=r.readLine();
					String[] temp = line.split(" ");
					int min = Integer.parseInt(temp[0]);
					for(int column=0;column<n;column++){
						int t = Integer.parseInt(temp[column]);
						m[row][column] = t;
						hands[row][column] = false;
						//record shortest index for each row
						if(t<min){
							min = t;
							shortindex[row] = column;
						}
					}
				}
				//look for the tallest student in each column
				for(int column=0;column<n;column++){
					int max = m[0][column],tallindex=0;
					for(int row=0;row<n;row++){
						if(m[row][column]>max){
							max = m[row][column];
							tallindex = row;
						}
					}
					if(column == shortindex[tallindex]){
						hands[tallindex][column] = true;
						break;
					}
				}
				int res = 0;
				for(int row=0;row<n;row++){
					for(int column=0;column<n;column++){
						if(hands[row][column]){
							res = m[row][column];
						}
					}
				}
				
				System.out.println(res);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}