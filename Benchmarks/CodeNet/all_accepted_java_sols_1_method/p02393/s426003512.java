import java.io.*;

class Main{
    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
                int a, b, c, d;

                String line = reader.readLine();
                String[] strAry = line.split(" ");

                a = Integer.parseInt(strAry[0]);
                b = Integer.parseInt(strAry[1]);
                c = Integer.parseInt(strAry[2]);

                while(2 >= 1){
                    if(a > b){
                        d = a;
                        a = b;
                        b = d;
                    }else if(b > c){
                        d = b;
                        b = c;
                        c = d;
                    }

                    if(a <= b && b <= c){
                        break;
                    }
                }

                System.out.println(a + " " + b + " " + c);
                
        } catch (IOException e) {
            //TODO: handle exception
            System.out.println(e);
        }
    }
}