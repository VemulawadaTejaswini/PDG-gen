import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
class Main {
  public static void main(String[] args) {
    try {
        var stdin = new BufferedReader(new InputStreamReader(System.in));
        String line;
        Long n=null;
        Long d=null;
        Long currentLine=0L;
        Long count=0L;
        while ((line = stdin.readLine()) != null && currentLine!=n) {
            if (n==null) {
                var splited = line.split(" ");
                n = Long.valueOf(splited[0]);
                d = Long.valueOf(splited[1]);
            } else {
                currentLine++;
                var splited = line.split(" ");
                Long x = Long.valueOf(splited[0]);
                Long y = Long.valueOf(splited[1]);
                if (x*x+y*y<=d*d) {
                    count++;
                }
            }

        }
        System.out.println(count);
    } catch(Exception e) {
    }
   
  }
}