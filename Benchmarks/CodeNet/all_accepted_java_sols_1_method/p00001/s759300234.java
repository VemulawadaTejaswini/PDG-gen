import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] a){
    	Scanner input = new Scanner(System.in);
    	int[] m_height = new int[10];
    	for(int i = 0 ; i < m_height.length ; i++){
    		m_height[i] = input.nextInt();
    	}
    	Arrays.sort(m_height);
    	for(int i = 9 ; i >= 7 ; i--){
    		System.out.println(m_height[i]);
    	}
    }
}