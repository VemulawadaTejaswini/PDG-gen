import java.util.*;
public class Main{
        public static void main(String[] args){
                Scanner コロナ = new Scanner(System.in);
                String わたし = コロナ.next();
                String あなた = コロナ.next();
                コロナ.close();
                int yoﾉ = 0;
                for(int i = 0 ; i < 3 ; i++){
                        if(わたし.charAt(i) == あなた.charAt(i)) yoﾉ++;
                }
                System.out.println(yoﾉ);
        }
}