import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;
        try {
            while((input = reader.readLine()) != null) {
                int n = Integer.parseInt(input);
                int count = 0;
                for(int a=0; a<10; a++){
                    for(int b=0; b<10; b++){
                        for(int c=0; c<10; c++){
                            for(int d=0; d<10; d++){
                                if(n == a+b+c+d){
                                    count++;
                                }
                            }
                        }
                    }
                }
                System.out.println(count);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}