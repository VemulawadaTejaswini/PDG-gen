import java.io.*;
public class Main{
    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            String wline = reader.readLine();
            String nline = reader.readLine();
            int w = Integer.parseInt(wline);
            int n = Integer.parseInt(nline);
            int i,a,b,x;
            int[] num = new int[w];

            for(i=0;i<w;i++){
                num[i] = i+1;
            }
            

            for(i=0;i<n;i++){ 
                String line = reader.readLine();
                String[] lines = line.split(",");
                a = Integer.parseInt(lines[0]);
                b = Integer.parseInt(lines[1]);
                x = num[a-1];
                num[a-1] = num[b-1];
                num[b-1] = x;
            }       
            for(i=0;i<w;i++){
                System.out.println(num[i]+"");
            }     
            
           
        } catch (FileNotFoundException e) {
            System.out.println("ファイルが存在しません。");
        } catch (IOException e) {
            System.out.println("エラーが発生しました。");
        }
        
    
    }
}
