import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
        
    int add=0;
    
    if(str.contains("ooo")){
        add=300;
    }else if(str.contains("oox")||str.contains("oxo")||str.contains("xoo")){
        add=200;
    }else if(str.contains("oxx")||str.contains("xxo")||str.contains("xox")){
        add=100;       
    }

        
        System.out.println(700+add);
    }
}
