import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            String N = br.readLine();
            //int N = Integer.parseInt(br.readLine());
            char charN[] = N.toCharArray();
            
            int sum = 0;
            for(int i=0; i<charN.length; i++){
                sum = sum + Character.getNumericValue(charN[i]);
            }
            
            if(sum%9 == 0){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
}