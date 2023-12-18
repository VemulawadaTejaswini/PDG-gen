import java.io.*;

public class Main{
    public static void main(String[]args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String crlf = System.getProperty("line.separator");
       
    
        
        while(true){
            String[] str = br.readLine().split(" ");
            int h = Integer.parseInt(str[0]);
            int w = Integer.parseInt(str[1]);
           
            if(h==0 && w==0){
                break;
            }else{
               
                for(int i=0;i<w;i++){
                   System.out.print("#"); //底辺
               }
               
               System.out.println();
               
               for(int i=0;i<h-2;i++){
                    System.out.print("#");
                    for(int j=0;j<w-2;j++){
                        System.out.print(".");
                    }
                    System.out.print("#");    
                    System.out.println();
               }
               
               for(int i=0;i<w;i++){
                   System.out.print("#"); //上辺
               }
               System.out.println();
            }
            System.out.println();
            
        }
        
        
        
        
    }
}