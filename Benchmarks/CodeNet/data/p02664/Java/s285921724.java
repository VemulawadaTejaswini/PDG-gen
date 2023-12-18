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
                    if(n == 0){
                        if(sb.substring(n+1, n+2) == "D") sb.replace(n, n+1, "P");
                        else sb.replace(n, n+1, "D");
                    }else if(n == sb.length()-1){
                        sb.replace(n, n+1, "D");
                    }else{
                        if(sb.substring(n+1, n+2) == "D") sb.replace(n, n+1, "P");
                        else sb.replace(n, n+1, "D");
                    }
                    break;
            }
        }

        System.out.println(sb.toString());
    }
}