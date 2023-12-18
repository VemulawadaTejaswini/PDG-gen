import java.io.*;

class Main{
    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {       
                    String line = reader.readLine();
                    double r = Integer.parseInt(line);
                    double pie = 3.141592653589;

                    double shu = 2 * pie * r; 
                    double men = pie * r * r * 1.00000;

                    System.out.println(shu + " "+ men);
                            
        } catch (IOException e) {
            //TODO: handle exception
            System.out.println(e);
        }
    }
}