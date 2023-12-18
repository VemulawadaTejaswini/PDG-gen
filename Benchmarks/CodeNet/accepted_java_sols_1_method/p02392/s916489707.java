import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String strInput = input.nextLine();
        String[] str = new String[3];
        str = strInput.split(" ");
        if(Integer.parseInt(str[0]) < Integer.parseInt(str[1]) && Integer.parseInt(str[1]) < Integer.parseInt(str[2])){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
