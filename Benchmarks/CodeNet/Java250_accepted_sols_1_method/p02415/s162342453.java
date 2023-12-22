import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String answer = "";
        int length = line.length();
        int i;
        char c;
        
        for(i=0;i<line.length();i++){
            if(Character.isLowerCase(line.charAt(i))){
                c = Character.toUpperCase(line.charAt(i));
                answer = answer + c;
            }else{
                c = Character.toLowerCase(line.charAt(i));
                answer = answer + c;
            }

        }
        System.out.println(answer);
    }
}
