import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        
        double r;
        double men, shu;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        
        r = Double.parseDouble(str);
        
        men = r * r * Math.PI;
        shu = 2 * r * Math.PI;
        
        System.out.printf("%1.6f %1.6f", men, shu);
    }
}