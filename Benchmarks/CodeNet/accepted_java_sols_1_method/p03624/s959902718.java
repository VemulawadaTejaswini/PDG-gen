import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        for(char i='a'; i<='z'; i++){
            if(s.indexOf(i)>=0){
                continue; //文字列内にアルファベットが含まれているとき
            }else{
                System.out.println(i);
                return;
            }
        }
        System.out.println("None");
    }
}
