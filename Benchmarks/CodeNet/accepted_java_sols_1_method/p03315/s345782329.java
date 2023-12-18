import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int sum = 0;

        if(s.charAt(0)=='+'){
            sum++;
        }else{
            sum--;
        }

        if(s.charAt(1)=='+'){
            sum++;
        }else{
            sum--;
        }

        if(s.charAt(2)=='+'){
            sum++;
        }else{
            sum--;
        }

        if(s.charAt(3)=='+'){
            sum++;
        }else{
            sum--;
        }
    System.out.println(sum);

    }

}
