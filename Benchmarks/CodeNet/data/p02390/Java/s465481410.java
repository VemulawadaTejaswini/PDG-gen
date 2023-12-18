import java.io.*;

public class Main 
{
    public static void main(String[] args) {
        BufferdReader br = new BufferdReader(new InputStreamReader(System.in),1);
        
        String s = br.readLine();
        
        int second = s % 60;
        int minutes = (s/60)%60;
        int hour = s / 3600;
        
    
        
        System.out.println (hour + ":"+minutes +":"+second );
        
    }
}