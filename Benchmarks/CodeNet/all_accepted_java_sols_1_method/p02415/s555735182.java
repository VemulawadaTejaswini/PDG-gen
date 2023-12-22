import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String code = sc.nextLine();
        String answer = "";

        for(int i=0;i<code.length();i++){
            char box = code.charAt(i);

            if(Character.isLowerCase(box)){
                answer += Character.toUpperCase(box);
            }else{
                answer += Character.toLowerCase(box);
            }
        }

        System.out.println(answer);

        sc.close();
    }
}
