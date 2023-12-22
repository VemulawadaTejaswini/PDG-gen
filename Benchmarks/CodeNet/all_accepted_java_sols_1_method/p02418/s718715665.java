import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String lineLine = line + line;
        String word = sc.nextLine();
        if(lineLine.contains(word)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
    }
}
