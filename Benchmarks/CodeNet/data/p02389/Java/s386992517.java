import java.io.*;

class Main{
    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
                String line = reader.readLine();
                String[] strAry = line.split(" ");
                int[] a = new int[strAry.length]; 

                for(int i = 0; i <strAry.length; i++){
                    a[i] = Integer.parseInt(strAry[i]);
                }

                System.out.print(menseki(a[0], a[1]));
                System.out.println(shu(a[0], a[1]));

        } catch (IOException e) {
            //TODO: handle exception
            System.out.println(e);
        }catch(NumberFormatException e){
            System.out.println("??´??¢?????£????????????????????????");
        }

    }

    public static int menseki(int n, int m){
        int r;
        r = n * m;

        return r;
    }
    public static int shu(int n, int m){
        int r;
        r = 2 * (m + n);
        
        return r;
    }
}