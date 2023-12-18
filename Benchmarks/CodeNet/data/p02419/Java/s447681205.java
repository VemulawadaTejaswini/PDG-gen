import java.util.*;
 
public class Main {
    
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String obj;
        String str;
        int counter=0;
        
        obj=scan.nextLine();
        
        scan.useDelimiter("\\s");
        
        while(!((str=scan.next()).equals("END_OF_TEXT"))){
            if(str.contains(obj)){
                counter++;
            }
        }
        
        System.out.println(counter);
    }
        
}