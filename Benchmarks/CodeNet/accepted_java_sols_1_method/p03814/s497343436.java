import java.util.*;
public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int max = 0;
        int cnti = 0;
        int cntz = 0;

        for(int i = 0;i<s.length()-1;i++){
            if(s.charAt(i)=='A'){
                cnti=i;
                break;
            }
        }
        for(int i = s.length()-1;i>0;i--){
            if(s.charAt(i)=='Z'){
                cntz=i;
                break;
            }
        }
        System.out.println(cntz-cnti+1);

    }
}




