import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Main {
	public static void main (String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        String[] strNum = in.readLine().split(" ");
        List <Integer>numList = new ArrayList<Integer>();
        
        for (int i=0; i<n; i++) {
            numList.add(Integer.parseInt(strNum[i]));
        }
        
        Collections.sort(numList);
        
        for (int i=0; i<n; i++) {
            if (i==n-1) {
                System.out.println(numList.get(i));
            } else {
                System.out.printf("%d ", numList.get(i));
            }
        }
        
    }
}