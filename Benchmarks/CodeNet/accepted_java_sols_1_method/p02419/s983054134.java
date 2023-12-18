import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String word = scn.next();

        int num = 0;

        while(true){
            String sent = scn.next();
            if(sent.equals("END_OF_TEXT")) break;

            String sent_l = sent.toLowerCase();

            if(sent_l.equals(word)) num++;
        }

        System.out.println(num);
    }
}
