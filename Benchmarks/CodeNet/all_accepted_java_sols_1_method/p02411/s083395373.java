import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        while(!line.equals("-1 -1 -1")){
            String[] str = line.split(" ");
            String ret = "F";
            int m = Integer.parseInt(str[0]);
            int f = Integer.parseInt(str[1]);
            int r = Integer.parseInt(str[2]);
            int mf = m+f;
            if(m*f < 0){
                
            }else{
                if(mf<30){
                    
                }else if(mf<50){
                    ret = 50<=r ? "C":"D";
                }else if(mf<65){
                    ret = "C";
                }else if(mf<80){
                    ret = "B";
                }else{
                    ret = "A";
                }
            }
            System.out.println(ret);
            line = sc.nextLine();
        }
        
    }
}
