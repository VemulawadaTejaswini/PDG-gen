import java.io.*;

class Main{
    public static void main(String[] a){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            int[] mount = new int [10];
            for(int i = 0;i < 10;i++){
                String str = br.readLine();
                int high = Integer.parseInt(str);
                if(high >= 0 && high <= 10000){
                    mount[i] = high;
                }
                for(int k = 0;k <= i; k++){
                    if(mount[k] < mount[i]){
                        int h = mount[i];
                        mount[i] = mount[k];
                        mount[k] = h;
                    }
                }
            }
            for(int j = 0;j < 3; j++){
                System.out.println(mount[j]);
            }
        }
        catch(IOException e){
        }
    }
}