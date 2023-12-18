import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ball=sc.next();
        char[] result= ball.toCharArray();
        int j=0;
        for(int i=0;ball.length()>i;i++){
            String str =String.valueOf(result[i]);
            if("1".equals(str)){
                j++;
            }
        }
        System.out.println(j);
    }
}