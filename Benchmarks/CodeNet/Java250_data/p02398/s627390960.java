import java.io.*;

class Main{
    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {       
                    String line = reader.readLine();
                    String[] strAry = line.split(" ");
                    int a = Integer.parseInt(strAry[0]);
                    int b = Integer.parseInt(strAry[1]);
                    int c = Integer.parseInt(strAry[2]);

                    int d = 0, e = 0;

                    if(a > b){
                        d = a;
                        a = b;
                        b = d;
                    }

                for(int i = a; i <= b; i++){
                    if(c % i == 0){
                        e += 1;
                    }
                }

                System.out.println(e);
                
        } catch (IOException e) {
            //TODO: handle exception
            System.out.println(e);
        }
    }
}