import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
    public static List<Integer> getList(BufferedReader in) throws IOException{
        List<String> li = Arrays.asList(in.readLine().split(" "));
        List<Integer> gath = new ArrayList<Integer>();

        for(String a: li){
            gath.add(Integer.parseInt(a));
        }
        Collections.sort(gath);
        return gath;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        in.readLine();
        List<Integer> gaths = getList(in);
        in.readLine();
        List<Integer> gatht = getList(in);

        int i=0;
        int k=0;
        int t;
        for(int s: gaths){
            while(true){
                t = gatht.get(i);
                if(s==t){
                    k++;
                    i++;
                    break;
                }
                else if(s<t){
                    break;
                }
                else if(s>t){
                    i++;
                }
            }
        }

        System.out.println(k);
        in.close();
    }
}