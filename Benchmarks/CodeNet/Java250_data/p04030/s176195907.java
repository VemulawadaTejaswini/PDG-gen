import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String [] a = sc.nextLine().split("");
        int b = a.length;
        String answer = "";
        for(int i = 0;i<b;i++){
            if(a[i].equals("0")){
                answer += "0";
            }
            if(a[i].equals("1")){
                answer += "1";
            }
            if(a[i].equals("B")){
                if(answer != null && answer.length() > 0){
                    answer = answer.substring(0,answer.length()-1);
                }
            }
        }
        System.out.println(answer);
    }
}