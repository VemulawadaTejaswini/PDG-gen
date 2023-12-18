import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            String line = sc.nextLine();
            if(line.equals("0")){
                break;
            }
            int Sum = 0;
            for(int i = 0; i < line.length(); i++){
                Sum += line.charAt(i) - '0';
            }
            System.out.println(Sum);
        }
    }
}
