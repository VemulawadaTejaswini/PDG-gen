import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true){
            String ts = sc.nextLine();
            if(ts.equals(".")) break;

            String s = "";

            for(int i = 0; i < ts.length(); i++){
                if(ts.charAt(i) == '(' || ts.charAt(i) == ')' ||
                   ts.charAt(i) == '[' || ts.charAt(i) == ']'){
                    s += ts.charAt(i);
                }
            }

            while(true){
                boolean flg = true;
                ts = s;

                s = s.replaceAll("\\(\\)", "");
                s = s.replaceAll("\\[\\]", "");

                if(ts.length() == s.length()){
                    break;
                }
            }

            if(s.length() == 0){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
        }
    }
}