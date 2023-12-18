
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n =Integer.parseInt(br.readLine());
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        for(int i=0;i<n;i++){
            String[] tokens = br.readLine().split(" ");
            a.add(Integer.parseInt(tokens[0]));
            b.add(Integer.parseInt(tokens[1]));
        }
        int medA = median(a);
        int medB = median(b);
        System.out.println(Math.abs(medB-medA)+1);
    }

    public static int median(List<Integer> list){
        Collections.sort(list);
        if(list.size()%2==1){
            return list.get(list.size()/2);
        }else {
            return list.get(list.size()/2)  + list.get(list.size()/2 -1);
        }
    }



}