import java.util.*;

public class Main{

    public static void main(String[] args){

        Scanner in =new Scanner(System.in);
        String winlose=in.next();

        int count_win=0;

        for(int i=0;i<winlose.length();i++){
            if(winlose.charAt(i)=='o'){
                count_win++;
            }
        }

        int check=count_win+(15-winlose.length());
        
        if(check>=8) {
            System.out.print("YES");
        }
        else System.out.print("NO");
    }
}