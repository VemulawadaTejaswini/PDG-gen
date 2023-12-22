import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	Integer[] height = new Integer[10];
    	
    	for(int i = 0; i < height.length; i++){
    		try {
				height[i] = Integer.parseInt(br.readLine());
			} catch (NumberFormatException e) {
				System.out.println("数字を入力してください");
			} catch (IOException e) {
				e.printStackTrace();
			}
    	}
    	Arrays.sort(height, Collections.reverseOrder());
    	for(int i = 0; i < 3; i++){
    		System.out.println(height[i]);
    	}
    }
}