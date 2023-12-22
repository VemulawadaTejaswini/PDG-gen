
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class Main {
    private static final Map<Integer,Boolean> happy = new HashMap<>();
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tokens = br.readLine().split(" ");
        int a= Integer.parseInt(tokens[0]);
        int b= Integer.parseInt(tokens[1]);
        System.out.println(a*b);
    }


}