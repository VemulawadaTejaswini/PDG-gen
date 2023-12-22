import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String [] inp = buffer.readLine().split(" ");
        int d = Integer.parseInt(inp[0]), t = Integer.parseInt(inp[1]), s = Integer.parseInt(inp[2]);
        if(s*t>=d){
            System.out.println("Yes");
        }
        else
            System.out.println("No");
    }
}
