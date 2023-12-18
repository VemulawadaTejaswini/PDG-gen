import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        char line[] = sc.nextLine().toCharArray();
        for(int i = 0; i < line.length; i++){
            if(Character.isUpperCase(line[i])){
                sb.append(Character.toLowerCase(line[i]));
                
            }else{
                sb.append(Character.toUpperCase(line[i]));
            }
        }
       System.out.println(new String(sb));
    }
}
