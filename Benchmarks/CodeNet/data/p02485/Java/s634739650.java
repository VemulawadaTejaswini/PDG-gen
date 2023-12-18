import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String num = scan.nextLine();

        while (num != "0"){
            int sum = 0;

            for(int i = 0; i < num.length(); i++){
                sum += num.charAt(i) - '0';
            }

            System.out.println(sum);
            sum = 0;
            num = scan.nextLine();
        }
    }
}