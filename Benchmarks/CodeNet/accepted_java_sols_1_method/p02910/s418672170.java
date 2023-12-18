import java.util.HashMap;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s  = sc.next().toCharArray();
        boolean can = true;
        for(int i=0;i<s.length;i++){
            char tmp = s[i];
            if((i+1)%2==1){
                if(tmp=='R' || tmp=='U' || tmp=='D'){
                    continue;
                }
                can = false;
            }else{
                if(tmp=='L' || tmp=='U' || tmp=='D'){
                    continue;
                }
                can = false;
            }
            break;
        }
        if(can){
            System.out.println("Yes");                                                                                                                                                                                                                                          
        }else{
            System.out.println("No");
        }
    }
}