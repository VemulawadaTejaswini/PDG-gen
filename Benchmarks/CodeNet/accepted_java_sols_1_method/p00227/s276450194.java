import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        String[] in = null;
        int numBuy, numIn;
        ArrayList<Integer> costVegitables = new ArrayList<>();

        try {
            while((line = input.readLine()) != null){
                in = line.split(" ");
                if(in[0].equals("0") && in[1].equals("0")){
                    break;
                }
                numBuy = Integer.parseInt(in[0]); numIn = Integer.parseInt(in[1]);

                line = input.readLine();
                in = line.split(" ");
                costVegitables.clear();
                for(String str : in){
                    int cost = Integer.parseInt(str);
                    costVegitables.add(cost);
                }
                Collections.sort(costVegitables, Collections.reverseOrder());

                int index = 1;
                int minimumCost = 0;                
                for(int i: costVegitables){
                    if(index%numIn != 0){
                        minimumCost += i;
                    }
                    index++;
                }
                System.out.println(minimumCost);
            }
        } catch (IOException e) {
            System.out.println("IOException");
        } catch (NumberFormatException e){
            System.out.println("including not int");
        }
    }
}
