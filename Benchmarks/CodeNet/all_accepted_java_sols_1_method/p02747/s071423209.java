import java.util.*;
     
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in);
        
        ){
 
            String hitachi = sc.next();
            StringBuilder sb = new StringBuilder();
            int yesFlg = 0; 
            for(int i = 0; i < 5; i++){
                sb.append("hi");
                if(hitachi.equals(sb.toString())){
                    System.out.println("Yes");
                    yesFlg += 1; 
                }
            }
            if(yesFlg == 0){
                System.out.println("No");
            }
 
        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}