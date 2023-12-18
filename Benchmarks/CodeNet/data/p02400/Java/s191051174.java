import java.io.*;
class Main {
    public static void main(String[] args) {
       try{ double i = 0,num = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        double r = Double.parseDouble(line);

        i = 2 * Math.PI * r;
        num = Math.PI * r * r;

        System.out.printf("%.10f %.10f\n",num,i);
        }catch(IOException e){
            System.out.println(e);
        }catch(NumberFormatException e){
            System.out.println("put the number");
        }
    }
}

