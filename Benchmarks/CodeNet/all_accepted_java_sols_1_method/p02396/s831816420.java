import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int count = 1;
        while(true){
            String str = input.nextLine();
            if(!str.equals("0")){
                System.out.println("Case "+ count + ": " + str);
                count = count + 1;
            }else{
                break;
            }
        }
    }
}
