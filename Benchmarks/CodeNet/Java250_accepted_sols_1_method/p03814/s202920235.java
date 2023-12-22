import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int length = s.length();
        int count_A = -1;
        int count_Z = 0;

        for(int i = 0; i < length; i++){
            char moji = s.charAt(i);
            if(moji == 'A'){
                if(count_A == -1){
                    count_A = i;
                }
            }else if(moji == 'Z'){
                if(count_Z < i){
                    count_Z = i;
                }
            }
        }
        System.out.println(count_Z - count_A + 1);
    }
}