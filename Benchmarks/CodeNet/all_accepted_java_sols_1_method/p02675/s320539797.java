import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int valLen = String.valueOf(a).length(); 
        String s = String.valueOf(a);
        String i = s.substring(valLen-1);
        int c = Integer.parseInt(i);
        if(c == 3){
            System.out.println("bon");
        }else if(c == 0 || c == 1 || c == 6 || c == 8){
            System.out.println("pon");
        }else{
            System.out.println("hon");
        }
    }
}