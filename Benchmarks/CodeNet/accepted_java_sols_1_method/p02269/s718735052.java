import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            Set<String> set = new HashSet<String>();
            int n = Integer.parseInt(reader.readLine());
            int[] eq = new int[n];
            int k = 0;
            for(int i = 0; i < n; i++){
                String line = reader.readLine();
                String[] str = line.split(" ");
                if(str[0].equals("insert")){
                    set.add(str[1]);
                }else if(str[0].equals("find")){
                    if(set.contains(str[1])){
                        eq[k] = 1;
                    }else{
                        eq[k] = 0;
                    }
                    k++;
                }
            }
            for(int i = 0; i < k; i++){
                if(eq[i] == 1){
                    System.out.println("yes");
                }else if(eq[i] == 0){
                    System.out.println("no");
                }
            }
        }catch(IOException e){

        }
    }
}
