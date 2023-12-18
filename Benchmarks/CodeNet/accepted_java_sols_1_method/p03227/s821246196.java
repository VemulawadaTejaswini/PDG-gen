import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        if(a.length() == 2){
            System.out.println(a);
        }else{
            for(int i = 2; i >= 0; i--){
                System.out.print(a.charAt(i));
            }
        }
    }
}