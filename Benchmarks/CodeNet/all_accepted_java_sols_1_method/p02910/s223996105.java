import java.util.*;

public class Main{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int b = 1;

        for(int i = 0; i < s.length(); i++){
            if(i % 2 == 0){
                if(s.charAt(i) == 'L'){
                    b = 0;
                    break;
                }
            }else{
                if(s.charAt(i) == 'R'){
                    b = 0;
                    break;
                }
            }
        }

        if(b == 1) System.out.println("Yes");
        else System.out.println("No");

    }

}
