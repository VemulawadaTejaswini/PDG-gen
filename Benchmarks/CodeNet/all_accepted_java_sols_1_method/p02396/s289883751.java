import java.io.*;

class Main{
    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
                int x = 0;
                int[] b = new int[100000];
                int a = 1;

                while(a != 0){
                    String line = reader.readLine();
                    a = Integer.parseInt(line);
                    b[x] = a;
                    x += 1;
                }

                for(int i = 0; i < (x - 1); i++){
                    System.out.println("Case " + (i+1) + ": " + b[i]);
                }
                
        } catch (IOException e) {
            //TODO: handle exception
            System.out.println(e);
        }
    }
}