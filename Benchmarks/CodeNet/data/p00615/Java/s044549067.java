import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String line;
            /* input */
            while(true){
                line = br.readLine();
                int n = Integer.parseInt(line.split(" ")[0]), m = Integer.parseInt(line.split(" ")[1]);
                if(n==0&&m==0) break;
 
                ArrayList<Integer> t = new ArrayList<Integer>();
                t.add(0);
                int max = 0;
 
                if(n>0){
                    String[] str = br.readLine().split(" ");
                    for(int i=0;i<n;i++){
                        t.add(Integer.parseInt(str[i]));
                    }
                }
 
                if(m>0){
                    int index = 1;
                    String[] str = br.readLine().split(" ");
                    for(int i=n;i<n+m;i++){
                        int temp = Integer.parseInt(str[i-n]);
                        while(index < t.size() && t.get(index) < temp){
                            index++;
                        }
                        t.add(index,temp);
                    }
                }
                for(int i=0;i<n+m;i++){
                    if(t.get(i+1) - t.get(i) > max) max = t.get(i+1) - t.get(i);
                }
 
                System.out.println(max);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}