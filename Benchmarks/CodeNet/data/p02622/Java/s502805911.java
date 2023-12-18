import java.util.*;
    class Berg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter =0;

        String w1 = input.next();
        String w2 = input.next();

        char[] first  = w1.toLowerCase().toCharArray();
        char[] second = w2.toLowerCase().toCharArray();


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




