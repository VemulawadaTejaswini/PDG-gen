import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ox = sc.next();
        int x_count = 0;
        
        for(int i = 0; i < ox.length(); i++){
            char c = ox.charAt(i);
            if(c == 'x'){
                x_count++;
            }
        }
        if(x_count<=7){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }
}
