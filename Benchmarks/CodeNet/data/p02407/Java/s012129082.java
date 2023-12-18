import java.io.*;

class Main{
    piblic static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int x = IntegerpaseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        
        for(int i = str.length; i > 0; i--){
            System.out.println(str[i-1]);
            if(i != 1){
                System.out.println(" ");
            }
        }
    }
    System.out.println();
}