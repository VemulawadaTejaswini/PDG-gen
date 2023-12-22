import java.io.*;
class Main{
    public static void main(String[]args){
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
      	int x;
        try{
            x = Integer.parseInt(bf.readLine());
        }catch(Exception e){
          	x = 0;
        }
     	x = (int)Math.pow(x,3);
        System.out.println(x);
    }
}
