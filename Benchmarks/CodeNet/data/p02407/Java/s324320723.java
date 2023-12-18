import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader c = new BufferedReader(new InputStreamReader(System.in));
            int count = Integer.parseInt(c.readLine());
            
            BufferedReader stdReader = new BufferedReader(new InputStreamReader(System.in));
            
            String line;
            
            while((line = stdReader.readLine()) != null) {
                // ?????????????§???????????????§????????????????????\??????
                String[] array = line.split(" ", 0);
                
                // ????????????????????\????????????
                String[] invArray = new String[count];
                int inv = count - 1;
                for(int i = 0; i < count; i++) {
                    invArray[inv - i] = array[i];
                }
                
                // ??\???????????????????????¨?????????
                for(int j = 0; j < count; j++) {
                    System.out.print(invArray[j]);
                    if(j != (count-1)) {
                        System.out.print(" ");
                    }
                }
                System.out.println();
                
            }
            stdReader.close();
        } catch(Exception e) {
            e.getStackTrace();
            System.exit(-1);
        }
    }
}