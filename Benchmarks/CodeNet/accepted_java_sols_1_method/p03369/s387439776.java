import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int count = 0;
        for(int i=0;i<3;i++){
            if(S.charAt(i)=='o') count++;
        }
        System.out.print(700+count*100);
    }
}