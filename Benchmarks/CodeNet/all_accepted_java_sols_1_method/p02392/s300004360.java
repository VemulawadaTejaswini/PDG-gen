import java.io.*;

class Main{
    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
                int a, b, c;

                String line = reader.readLine();
                String[] strAry = line.split(" ");

                a = Integer.parseInt(strAry[0]);
                b = Integer.parseInt(strAry[1]);
                c = Integer.parseInt(strAry[2]);

                
                if(a < b && b < c){
                    System.out.println("Yes");
                }else {
                    System.out.println("No");
                }

        } catch (IOException e) {
            //TODO: handle exception
            System.out.println(e);
        }
    }
}