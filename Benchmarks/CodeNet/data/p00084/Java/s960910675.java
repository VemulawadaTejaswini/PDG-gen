import java.util.*;
public class Main {
        public static void main(String[] args) throws java.io.IOException{
            Scanner scan = new Scanner(System.in);
            StringBuilder sb =new StringBuilder();
            String [] words = scan.nextLine().split("[ ,.]");
            for(int i=0;i<words.length;i++){
                if(words[i].length()>=3&&words[i].length()<=6){
                    sb.append(words[i]);
                    /*if(i!=(words.length-1)) */ sb.append(" ");
                }
            }
            System.out.println(sb.toString());
        }
}