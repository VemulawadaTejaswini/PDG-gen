import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String args[]) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String list[] = br.readLine().split(" ");
	Set<String> listSet = new HashSet<String>(Arrays.asList(list));

	if (listSet.size() == 2)
	    System.out.println("Yes");
	else
	    System.out.println("No");
    }
}