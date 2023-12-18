import java.io.*;
  
class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(buf.readLine());
          
        for(int j=3; j<=n; j++){
            if(j%3==0 || (j%10)== 3){
                System.out.println(" "+j);
            }           
  
        }
        System.out.println(sb);
    }
}