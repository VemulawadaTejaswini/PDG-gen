import java.util.*;
public class Main{
    public static void main(String[] args){
        try{
            Scanner sn = new Scanner(System.in);
            String str = sn.nextLine();
            int r = Integer.parseInt(str);
            sn.close();
           
            if(1 <= r || r <=100){
                System.out.println(r*r*3);
            }else{
                return;
            }
        }catch(Exception e){
            //do nothing
            return;
        }
    }
}