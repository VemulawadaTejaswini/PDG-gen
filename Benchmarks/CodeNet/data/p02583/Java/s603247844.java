import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.LinkedList;
import java.util.Arrays;
import java.util.stream.Collectors;

class Main {
  public static void main(String[] args) {
    try {
        var stdin = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        Integer n = null;
        while((line = stdin.readLine()) == null);
        n = Integer.valueOf(line);
        line = null;
       while((line = stdin.readLine()) == null);
        var parsed = Arrays.asList(line.split(" ")).stream().map(s -> Integer.valueOf(s)).sorted().collect(Collectors.toList());
        if (parsed.size() < 3) {
            System.out.println("0");
            return;
        }
        
        int count =0;
        for (int x = 0;x<n;x++) {
            for (int y = x+1;y<n;y++) {
                int currentValueX = parsed.get(x);
                int currentValueY = parsed.get(y);
                if (currentValueX == currentValueY) continue;
                int left = Math.abs(currentValueX-currentValueY);
                int right = currentValueX + currentValueY;
                count += parsed.stream().skip(y+1).filter(item -> item != currentValueX && item != currentValueY && left < item && item < right).count();
            }
        }
        System.out.println(count);
        /*
        a+b>cかつb+c>aかつc+a>b
|b-c| <a < b+c

for (
*/        
       
    } catch(Exception e) {
    }
   
  }
}