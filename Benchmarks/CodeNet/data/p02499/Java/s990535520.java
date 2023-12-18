import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        int[] data = new int[256];
        for (int i:data)i=0;
        for(char c:new Scanner(System.in).nextLine().toLowerCase().toCharArray())
        {
            data[c]++;
        }
        for (char c ='a';c<='z';c++)
        {
            System.out.println(c + " : "+data[c]);
        }
    }
}