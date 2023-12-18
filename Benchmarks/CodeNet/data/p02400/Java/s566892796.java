import java.io.*;

class Main{
    static double keta(double x){
        x = x * 10000000;
        if((x % 10) >= 5){
            x += 10;
        }
        
        x = (x - (x % 10)) / 10000000;

        return x;
    }

    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {       
                    String line = reader.readLine();
                    double r = Double.parseDouble(line);
                    double pie = 3.141592653589;

                    double shu = 2 * pie * r; 
                    double men = pie * r * r ;

                   double shu2 = keta(shu); 
                   double men2 = keta(men);

                    System.out.println(men2 + " "+ shu2 );
                            
        } catch (IOException e) {
            //TODO: handle exception
            System.out.println(e);
        }
    }
}