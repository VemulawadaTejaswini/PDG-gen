import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Vector;
 
public class Main {

    public static void main(String[] args) throws Exception{
        // 入力
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // カウント
        int count = Integer.parseInt(br.readLine());
        // 
        ArrayList<String> list = new ArrayList<String>();
        for(int i = 0; i < count; i++){
            String[] inputs = br.readLine().split(" ");
            
            if(inputs[0].equals("0")){
                // pushBack
                list.add(list.size(), inputs[1]);
            }
            else if(inputs[0].equals("1")){
                // randomAccess
                System.out.println(list.get(Integer.parseInt(inputs[1])));
            }
            else {
                // popBack
                list.remove(list.size() - 1);
            }
        }
    }
}
