import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        while(sc.hasNextLine()){
            int a = sc.nextInt();
            if(a != 0){
                sb.append(a);
            }else{
                if(sb.charAt(sb.length() - 1) != '0'){
                    System.out.println(sb.charAt(sb.length() - 1));
                    sb.deleteCharAt(sb.length() - 1);
                }else{
                    System.out.println(sb.substring(sb.length()-2, sb.length()));
                    sb.delete(sb.length() - 2 , sb.length());
                }
            }

        }
    }
}