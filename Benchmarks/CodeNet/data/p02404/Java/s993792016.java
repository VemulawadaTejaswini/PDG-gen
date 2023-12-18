import java.io.*;

public class Frame{
    public static void main(String[] args){
        int H,W;
        String line;

        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

        try{
            while(true){
                line=reader.readLine();
                H=Integer.parseInt(line);
                line=reader.readLine();
                W=Integer.parseInt(line);

                if(H==0&&W==0)break;

                for(int i=0;i<H;i++){
                    for(int j=0;j<W;j++){
                        if(i==0||i==H-1){
                            System.out.print("#");
                        }
                        else{
                            if(j==0||j==W-1){
                                System.out.print("#");
                            }
                            else{
                                System.out.print(".");
                            }
                        }
                    }
                    System.out.println();
                }
            }
        }
        catch(IOException e){
            System.out.println(e);
        }
        catch(NumberFormatException e){
            System.out.println(e);
        }
    }
}
