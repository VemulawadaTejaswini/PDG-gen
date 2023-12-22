import java.util.Scanner;

public class Main{

    public static void main(String[] args){


        Scanner scanNum = new Scanner(System.in);

        String inputNum = scanNum.next();

        scanNum.close();

        char[] charArray = inputNum.toCharArray();

        String print = "";

        for(int i=0; i < inputNum.length() ; i++){
            if(charArray[i] == '1'){
                charArray[i] = '9';
                print = print + 9;
            }
            else{
                charArray[i] = '1';
                print = print + 1;
            }
        }


        System.out.print(print);
    }
}