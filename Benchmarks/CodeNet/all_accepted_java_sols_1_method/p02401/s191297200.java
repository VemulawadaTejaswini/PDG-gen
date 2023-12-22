import java.util.Scanner;

public class Main {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        
        while(true){
            String line = sc.nextLine();
            String[] arr = line.split(" ");

            // String型をint型に変換
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[2]);

            int result = 0;

            if(arr[1].equals("+")){
                result = a + b;
            }else if(arr[1].equals("-")){
                result = a - b;
            }else if(arr[1].equals("*")){
                result = a * b;
            }else if(arr[1].equals("/")){
                result = a / b;
            }else if(arr[1].equals("?")){
                break;
            }

            System.out.println(result);
        }   
        sc.close();
    }
}
