import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String S=scan.nextLine();
        String T=scan.nextLine();
        String Y="Yes";
        String N="No";
        int x=0;
        if(S.length()<=10){
            if(T.length()==S.length()+1){
                for(int i=0;i<T.length()-1;i++){
                    if(S.charAt(i)==T.charAt(i)){
                        x++;
                        String y=Y;
                    }
                    else{
                        System.out.println(N);
                    }
                }
                if(x == S.length()) {
                    System.out.println(Y);
                }
            }
            else{
                System.out.println(N);
            }
        }
    }
}
