import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt(); sc.nextLine();
        String line = sc.nextLine();
        
        if(line.length() <= limit){
            System.out.println(line);
        }
        else{
            line = line.substring(0, limit) + "...";
            System.out.println(line);
        }
    }
}