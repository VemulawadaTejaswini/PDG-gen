import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int hug = 0;
        if(str.length()%2 == 0){
            for(int i =0; i<str.length()/2;i++){
                if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                    hug ++;
                }
            }
        }else{
            for(int i =0; i<(str.length()-1)/2;i++){
                if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                    hug ++;
                }
            }
        }
        System.out.println(hug);
    }
}