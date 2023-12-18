import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
 import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<String> array = new ArrayList<String>();
        
       
        for(int i=0;i<n;i++){
            String query = scan.next();
            if(query.equals("insert")){
                String item = scan.next();
                if(array.contains(item) == false) array.add(item);
            }else if(query.equals("find")){
                if(array.contains(scan.next())){
                    System.out.println("yes");
                }else{
                    System.out.println("no");   
                }
            }
        }
        
        
        scan.close();
    }
    
}