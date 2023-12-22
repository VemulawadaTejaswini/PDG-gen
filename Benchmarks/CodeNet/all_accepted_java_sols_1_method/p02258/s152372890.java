import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            int n = Integer.parseInt(br.readLine());
            ArrayList<Integer> array = new ArrayList<>();
            for(int i = 0 ; i < n ; i++){
                array.add(Integer.parseInt(br.readLine()));
            }
            int max = array.get(1) - array.get(0);
            int min = array.get(0);
            for(int i = 1 ; i < n ; i++){
                if(array.get(i) - min > max){
                    max = array.get(i) - min;
                }
                if(array.get(i) < min){
                    min = array.get(i);
                }
            }

            System.out.println(max);

        }
        catch(Exception e){
            System.err.println(e);
        }


    }
}