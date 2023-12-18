import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        //System.out.println(input);
        String[] cinput = input.split("");

        for(int i=0; i<input.length(); i++)
        {
            if(cinput[i].charAt(0)>='a' && cinput[i].charAt(0)<='z')
            {
                //System.out.println(i+" "+cinput[i].charAt(0));
                cinput[i] = cinput[i].toUpperCase();
                //System.out.println(i+" "+cinput[i].charAt(0));
            }
            else if(cinput[i].charAt(0)>='A' && cinput[i].charAt(0)<='Z')
            {
                //System.out.println(i+"oh yeah "+cinput[i].charAt(0));
                cinput[i] = cinput[i].toLowerCase();
                //System.out.println(i+"oh yeah "+cinput[i].charAt(0));
            }
        }

        for(int i=0; i<input.length(); i++)
        {
            System.out.printf("%s",cinput[i]);
        }
        System.out.printf("\n");
        sc.close();
    }
}
