import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        String mae = "";
        String usiro = "";
        while(!word.equals("-")){
            int n = sc.nextInt();
            for(int i=0;i<n;i++){
                int a  = sc.nextInt();
                usiro = word.substring(a);
                mae = word.substring(0,a);
                word = usiro + mae;
            }
            System.out.println(word);
            word = sc.next();
        }
        sc.close();
    }
}
