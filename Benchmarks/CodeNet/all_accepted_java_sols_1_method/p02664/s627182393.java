import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        sb.append(sn.next());

        for(int n=0; n<sb.length(); n++){
            switch(sb.substring(n, n+1)){
                case "P":
                    break;
                case "D":
                    break;
                case "?":
                    sb.replace(n, n+1, "D");
                    break;
            }
        }

        System.out.println(sb.toString());
    }
}