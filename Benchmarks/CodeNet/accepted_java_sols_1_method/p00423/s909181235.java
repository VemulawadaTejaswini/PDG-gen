import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args){
		ArrayList<Integer[]> resultList = new ArrayList<Integer[]>();
		try{
			BufferedReader std = new BufferedReader(new InputStreamReader(System.in));
			int len;
			while( (len = Integer.parseInt(std.readLine())) != 0){
				Integer scores[] = {0, 0};
				for(int i=0; i<len; i++){
					String num[] = std.readLine().split(" ");
					if(num[0].compareTo(num[1]) > 0){       scores[0] += Integer.parseInt(num[0]) + Integer.parseInt(num[1]); }
					else if(num[0].compareTo(num[1]) < 0){  scores[1] += Integer.parseInt(num[0]) + Integer.parseInt(num[1]); }
					else{                                   scores[0] += Integer.parseInt(num[0]);  scores[1] += Integer.parseInt(num[1]); }
				}
				resultList.add(scores);
			}
		}
		catch(IOException e){}
		catch(NumberFormatException e){}
		for(Integer result[] : resultList)
			System.out.println(result[0] + " " + result[1]);
	}
}