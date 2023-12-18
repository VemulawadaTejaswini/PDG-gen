import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner str = new Scanner(System.in);
        String S = str.next();
        StringBuilder result = new StringBuilder("");
        for(int i = 0; i < S.length(); i++){
            result.append("x");
        }

        System.out.println(result);
    }
}