import java.util.*;
 
import java.io.*;
 
public class Main{
    
	public static void main(String[] $){
		Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        HashMap<String, Integer> normalSet = new HashMap<String, Integer>();
        for(int i = 0; i <= 9; i++){
            for(int j = 0; j <= 9; j++){
                normalSet.put(String.valueOf(i)+String.valueOf(j), 0);
            }
        }

        for(int i = 1; i <= N; i++){
            String normal = String.valueOf(i);
            String normalmoji = String.valueOf(normal.charAt(0)) + String.valueOf(normal.charAt(normal.length()-1));
            normalSet.put(normalmoji, normalSet.get(normalmoji)+1);
        }

        long result = 0;
        for(int i = 0; i <= 9; i++){
            for(int j = 0; j <= 9; j++){
                result += normalSet.get(String.valueOf(i)+String.valueOf(j))*normalSet.get(String.valueOf(j)+String.valueOf(i));
                
            }
        }
        
        System.out.println(result);
	}
} 