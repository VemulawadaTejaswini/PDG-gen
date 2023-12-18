import java.util.*;
    class Berg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter =0;

        String S = input.next();
        String T = input.next();

        char[] first  = S.toLowerCase().toCharArray();
        char[] second = T.toLowerCase().toCharArray();


        int minLength = Math.min(first.length, second.length);

        for(int i = 0; i < minLength; i++)
        {
            if (first[i] != second[i])
            {
                counter++;
            }
        }
        System.out.println(counter);
    }
}




