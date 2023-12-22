import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;


public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while(!(str = br.readLine()).equals("0")){
        	List<String> list =Arrays.asList(br.readLine().split(" "));
        	double average = list.stream().mapToDouble(s-> Double.parseDouble(s)).average().getAsDouble();
        	double d = list.stream().mapToDouble(s-> Double.parseDouble(s)).map(s-> (s-average) * (s-average)).sum();
        	System.out.println(Math.sqrt(d/Integer.parseInt(str)));
        }
    }
}