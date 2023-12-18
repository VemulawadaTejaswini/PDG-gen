import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String s = scan.next();

        String[] str = new String[7];
        str[0] = "SAT"; 
        str[1] = "FRI";
        str[2] = "THU";
        str[3] = "WED";
        str[4] = "TUE";
        str[5] = "MON";
        str[6] = "SUN";

        for(int i = 1; i <= 7; i++){
            if(s.equals(str[i - 1])){
                System.out.println(i + " ");
                break;
            }
        }
    }
}
