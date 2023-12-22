import java.util.Scanner;
 
class Main{
 
    public static void main(String[] args){
 
        Scanner scanner = new Scanner(System.in);
        String val1 = scanner.next();
        String val2 = scanner.next();
        scanner.close();
        String check = val2.substring(0, val1.length());
        if(check.equals(val1)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
 
}