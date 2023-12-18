import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String wanted = sc.nextLine();
        int count = 0;
        while (true){
            String text = sc.nextLine();
            if (text.equals("END_OF_TEXT")){
                break;
            }
            count += count(text, wanted);
        }

        System.out.println(count);

    }



    public static String[] seperate(String text, String delimater) {
        return text.split(delimater);
    }

    public static int count(final String string, final String substring)
    {
        int count = 0;
       String[] have = string.split(" ");
       int length = have.length;
       for (int i =0; i< length; i++){
           if (have[i].toUpperCase().equals(substring.toUpperCase())){
               count++;
           }
       }

       return count;
    }
}

