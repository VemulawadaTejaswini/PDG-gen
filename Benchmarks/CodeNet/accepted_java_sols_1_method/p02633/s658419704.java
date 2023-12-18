import java.util.*;
public class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int 鶏 = sc.nextInt();
                sc.close();
                boolean あなた = true;
                for(int i = 1 ; i <= 360 && あなた ; i++){
                        if((i * 鶏) % 360 == 0){
                                System.out.println(i);
                                あなた = false;
                        }
                }
        }
}