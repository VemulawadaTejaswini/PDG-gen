import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
    public static void main(String[] args){
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String s = reader.readLine();
            String date = s.substring(4);
            String year = "2018";
            String ans = year.concat(date);
            System.out.println(ans);
        } catch (IOException e){
            e.printStackTrace();
        }
        
    }
}