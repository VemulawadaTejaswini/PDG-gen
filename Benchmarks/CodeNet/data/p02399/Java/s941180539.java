import java.io.*;

class Main{
    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {       
                    String line = reader.readLine();
                    String[] strAry = line.split(" ");
                    int a = Integer.parseInt(strAry[0]);
                    int b = Integer.parseInt(strAry[1]);
                    double c = 0.0000;
                    c = a / b;
                    int d = a / b;
                    System.out.println(d);
                    System.out.println(a % b);
                    System.out.println(c);

                            
        } catch (IOException e) {
            //TODO: handle exception
            System.out.println(e);
        }
    }
}