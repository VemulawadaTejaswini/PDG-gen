import java.io.*;
import java.util.*;

public class AreaofPolygons {
    
    public static void main(String[] args) throws IOException{
        int j = 1;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in),1);
        
        while(true){
            ArrayList<Integer> x = new ArrayList<>();
            ArrayList<Integer> y = new ArrayList<>();

            int n = Integer.parseInt(br.readLine());
            if(n == 0)
            {
                break;
            }
            for(int i = 0;i<n;i++)
            {
                String st = br.readLine();
                String[] num = st.split(" ",0);
                x.add(Integer.parseInt(num[0]));
                y.add(Integer.parseInt(num[1]));
            }
            int s = 0;
            for(int i = 0;i<n;i++)
            {
                if(i != n - 1)
                {
                    s += (x.get(i)*y.get(i+1) - x.get(i+1)*y.get(i));
                }else{
                    s += (x.get(i)*y.get(0) - x.get(0)*y.get(i));
                }
            }
            double S = Math.abs(s)/2.0;
            System.out.print(j+" ");
            System.out.printf("%.1f",S);
            System.out.println("");
            String musi = br.readLine();
            j++;
        }
    }
}