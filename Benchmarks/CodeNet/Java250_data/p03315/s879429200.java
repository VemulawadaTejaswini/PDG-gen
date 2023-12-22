import java.util.Scanner;
class Main
{
static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int takahashi = 0;
        String str = scan.next();

        for(int i =0 ;i<str.length();i++)
        {
            String s = String.valueOf(str.charAt(i));
            switch(s){
                case "+":
                takahashi++;
                break;
                case "-":
                takahashi--;
                break;
                default :
                break;
            }
        }
        System.out.println(takahashi);
    }

}