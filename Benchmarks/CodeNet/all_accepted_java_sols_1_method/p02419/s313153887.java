import java.util.*;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int count = 0;
        while(true){
            String lines = sc.nextLine();
            if(("END_OF_TEXT").equals(lines)){
                break;
            }
            
            String line[] = lines.split(" ");
            for(String a : line){
                if(a.equalsIgnoreCase(word)){
                    count++;
                }
                
            }
        }
     System.out.println(count);       
    }
}

