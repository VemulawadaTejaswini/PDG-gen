import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args){
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            String  t=br.readLine();
            boolean ff=false;
            for(int i=0;i<t.length();i++){
                if(t.charAt(i)=='7'){
                    ff=true;
                }
            }
            if(ff){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }catch(Exception e){
            System.out.println("KKKK "+e.getMessage());
        }
    }
}
