import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String strInput = input.nextLine();
        String[] str = new String[2];
        str = strInput.split(" ");
        System.out.println(Integer.parseInt(str[0])*Integer.parseInt(str[1])+ " " + (Integer.parseInt(str[0])*2+Integer.parseInt(str[1])*2));
    }
}
