import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String strInput = input.nextLine();
        String str[] = new String[2];
        str = strInput.split(" ");
        if(Integer.parseInt(str[0])<Integer.parseInt(str[1])){
            System.out.println("a < b");
        }else if(Integer.parseInt(str[0])>Integer.parseInt(str[1])){
            System.out.println("a > b");
        }else if(Integer.parseInt(str[0])==Integer.parseInt(str[1])){
            System.out.println("a == b");
        }
    }
}
