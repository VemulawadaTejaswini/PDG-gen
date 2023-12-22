import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        String str = scanner.next();
        int valLen = str.length(); 
        if(valLen == a){
            System.out.println(str);
        }else if(valLen < a){
            System.out.println(str);
        }else{
            String i = str.substring(0,a);
            System.out.println(i + "...");
        }
    }
}