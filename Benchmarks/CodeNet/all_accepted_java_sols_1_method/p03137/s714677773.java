import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] s1 = reader.readLine().split(" ");
        String[] s2 = reader.readLine().split(" ");
        List<Integer> point = new ArrayList<>();
        
        for (int i=0; i<s2.length; i++){
            point.add(Integer.parseInt(s2[i]));
        }

        Collections.sort(point);
        
        for (int i=0; i<point.size()-1; i++){
            point.set(i, point.get(i+1)-point.get(i));
        }
        
        point.remove(point.size()-1);
        Collections.sort(point);
        int ans=0;
        
        if (Integer.parseInt(s1[0]) < Integer.parseInt(s1[1])){
            for(int i=0; i<point.size()-(Integer.parseInt(s1[0])-1); i++){
                ans += point.get(i);
            }
        }
        
        System.out.println(ans);
        
        }catch(Exception e){
            System.out.println(e);
        }
    }
}