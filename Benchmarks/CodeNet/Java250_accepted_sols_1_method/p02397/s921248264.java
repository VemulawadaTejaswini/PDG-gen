import java.io.*;

class Main{
    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {       
                int[] x = new int[10000];
                int[] y = new int[10000];
                int a = 0, b = 0;

                while(2 > 1){
                    String line = reader.readLine();
                    String[] strAry = line.split(" ");

                    x[a] = Integer.parseInt(strAry[0]);
                    y[a] = Integer.parseInt(strAry[1]);

                    if(x[a] == 0 && y[a] == 0){
                        break;
                    }
                    a += 1;

                }


                for(int i = 0; i < a; i++){
                    if(x[i] > y[i]){
                        b = y[i];
                        y[i] = x[i];
                        x[i] = b;
                    }
                    System.out.println(x[i] + " " + y[i]);
                }
                
        } catch (IOException e) {
            //TODO: handle exception
            System.out.println(e);
        }
    }
}