import java.awt.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author k16121kk
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Integer> num = new ArrayList<>();
        int bottom = 0;
        for(int i = 0;i < 6; i++){
        num.add(sc.nextInt());
        }
        bottom = num.get(5);
       
        String ENSW = sc.next();
        
        for(int j = 0; j< ENSW.length(); j++){
            String direction =  String.valueOf(ENSW.charAt(j));
            
        if(direction.equals("E")){
            if(0 == num.indexOf(bottom)){
                bottom = num.get(3);
            }else if(1 == num.indexOf(bottom)){
                bottom = num.get(2);
            }else if(2 == num.indexOf(bottom)){
                bottom = num.get(0);
            }else if(3 == num.indexOf(bottom)){
                bottom = num.get(5);
            }else if(4 == num.indexOf(bottom)){
                bottom = num.get(2);
            }else{
                bottom = num.get(2);
            }
        }else if(direction.equals("N")){
            if(0 == num.indexOf(bottom)){
                bottom = num.get(3);
            }else if(1 == num.indexOf(bottom)){
                bottom = num.get(3);
            }else if(2 == num.indexOf(bottom)){
                bottom = num.get(5);
            }else if(3 == num.indexOf(bottom)){
                bottom = num.get(0);
            }else if(4 == num.indexOf(bottom)){
                bottom = num.get(3);
            }else{
                bottom = num.get(3);
            }
        }else if(direction.equals("S")){
            if(0 == num.indexOf(bottom)){
                bottom = num.get(4);
            }else if(1 == num.indexOf(bottom)){
                bottom = num.get(0);
            }else if(2 == num.indexOf(bottom)){
                bottom = num.get(1);
            }else if(3 == num.indexOf(bottom)){
                bottom = num.get(1);
            }else if(4 == num.indexOf(bottom)){
                bottom = num.get(5);
            }else{
                bottom = num.get(1);
            }
        }else{
            if(0 == num.indexOf(bottom)){
                bottom = num.get(2);
            }else if(1 == num.indexOf(bottom)){
                bottom = num.get(3);
            }else if(2 == num.indexOf(bottom)){
                bottom = num.get(5);
            }else if(3 == num.indexOf(bottom)){
                bottom = num.get(0);
            }else if(4 == num.indexOf(bottom)){
                bottom = num.get(3);
            }else{
                bottom = num.get(3);
            }
        }
            
            }
        System.out.println(num.get(5 - num.indexOf(bottom)));
        
    }
    
}

