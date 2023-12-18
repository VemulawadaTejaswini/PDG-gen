import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] ab=reader.readLine().split(" ");
        List<Integer> nums=new ArrayList<Integer>();
        for(int i=0;i<5;i++){
        	nums.add(Integer.parseInt(ab[i]));
        }
        int W=nums.get(0);
        int H=nums.get(1);
        int x=nums.get(2);
        int y=nums.get(3);
        int r=nums.get(4);
        
        if(x<r||x>(W-r)){
    		System.out.println("No");
        }else if(y<r||y>(H-r)){
    		System.out.println("No");
        }else{
    		System.out.println("Yes");
        }
	}
}