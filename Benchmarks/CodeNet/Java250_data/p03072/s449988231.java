import java.util.*;

public class Main {
        public static void main(String[] args){
            Scanner 平和堂 =new Scanner(System.in);
            int 彦根城 = 平和堂.nextInt();
            int[] 滋賀大学 = new int[彦根城];
            for(int 経済学部=0;経済学部<彦根城;経済学部++){
                滋賀大学[経済学部] = 平和堂.nextInt();
            }
            int おはようございます = 滋賀大学[0];
            int 留年者数 = 1;
            for(int データサイエンス学部=1;データサイエンス学部<彦根城;データサイエンス学部++){
                if(滋賀大学[データサイエンス学部]>=おはようございます){
                    留年者数++;
                    おはようございます=滋賀大学[データサイエンス学部];
                }
            }
            System.out.println(留年者数);
        }
}