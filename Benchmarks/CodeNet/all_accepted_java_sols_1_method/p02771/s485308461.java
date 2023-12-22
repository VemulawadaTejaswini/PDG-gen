import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String[] names = br.readLine().split(" ");
    Set<String> nameSet = new HashSet<String>(Arrays.asList(names));
    System.out.println(nameSet.size() == 2 ? "Yes" : "No");
    
  }
}