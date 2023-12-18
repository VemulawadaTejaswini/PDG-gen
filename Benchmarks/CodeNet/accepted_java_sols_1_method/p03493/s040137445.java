import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String num = scan.nextLine();
        int count = 0;
        for(int i = 0; i < 3; i++){
            char c = num.charAt(i);
            if(c == '1'){
                count++;
            }
        }
        System.out.println(count);
    }
}