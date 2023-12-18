import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {
    public static void main(String args[]) throws Exception {
        final BufferedReader br = new BufferedReader
                                 (new InputStreamReader(System.in));
        String inputString;

        while((inputString = br.readLine()) != null) {
            if(inputString.length() == 0)
                break;

            final int n = Integer.parseInt(inputString);
            LinkedList<Integer> ints = new LinkedList<Integer>();


            for(int i = 1; i <= n; i++)
                ints.add(i);

            int result = 0;
            int tmp = ints.get(0);

            while(tmp * tmp < ints.get(ints.size() - 1)) {
                tmp = ints.get(0);
                for(int i = 0; i < ints.size();)
                    if(ints.get(i) % tmp == 0)
                        ints.remove(i);
                    else
                        i++;
                result++;
            }

            result += ints.size();

            System.out.println(result);
        }
    }
}