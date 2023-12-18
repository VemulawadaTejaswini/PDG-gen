import java.io.*;

public class Chang{
    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            String[] lines = reader.readLine().split(" ");
            int h = Integer.parseInt(lines[0]);
            int w = Integer.parseInt(lines[1]);
            int i,j;
            for(i=0;i<h;i++){
                for(j=0;j<w;j++){
                    if((i+j)%2==0){
                        System.out.print("#");
                    }else{
                        System.out.print(".");
                    }
                }
                System.out.println();
            }
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
