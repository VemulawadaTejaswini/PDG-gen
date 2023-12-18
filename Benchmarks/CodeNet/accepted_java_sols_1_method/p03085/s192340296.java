import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String val = null;
        if (S.equals("A")) val = "T";
        else if (S.equals("T")) val = "A";
        else if (S.equals("G")) val = "C";
        else if (S.equals("C")) val = "G";

        System.out.println(val);
    }
}