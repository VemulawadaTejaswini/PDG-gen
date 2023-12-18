import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        for(int j=0; j<n; j++){
            String input = reader.readLine();
            int i=0;
            while(input.charAt(i) == '[') i++;

            System.out.println(getMinCount(input.substring(i, input.length()-i), i));
        }
    }

    public static int getMinCount(String input, int hierarchy){
        if(hierarchy == 0){
            return (Integer.parseInt(input)+2)/2;
        }
        String divider = "";
        for(int i=0; i<hierarchy; i++){
            divider = "\\]" + divider + "\\[";
        }
        String[] inputs = input.split(divider);
        int[] mins = new int[inputs.length];
        for(int i=0; i<inputs.length; i++){
            mins[i] = getMinCount(inputs[i], hierarchy-1);
        }
        Arrays.sort(mins);
        int sum = 0;
        for(int i=0; i<(inputs.length+1)/2; i++){
            sum += mins[i];
        }
        return sum;
    }
}