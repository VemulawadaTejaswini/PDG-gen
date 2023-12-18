import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int n = Integer.parseInt(line);
        String line2 = br.readLine();
        String[] str = line2.split(" ");
        int[] n_array = new int[n];
        for(int i=0;i<n;i++)n_array[i]=Integer.parseInt(str[i]);
        int q = Integer.parseInt(br.readLine());
        String line3 = br.readLine();
        String[] str2 = line3.split(" ");
        ArrayList<Integer> q_array = new ArrayList<Integer>();
        for(int i=0;i<q;i++)q_array.add(Integer.parseInt(str2[i]));
        int cnt=0;
        for(int i=0;i<n;i++){
        	for(int j=0;j<q_array.size();j++){
        		if(n_array[i]==q_array.get(j)){
        			q_array.remove(j);
        			cnt++;
        		}
        	}
        }
        System.out.println(cnt);        
	}
}