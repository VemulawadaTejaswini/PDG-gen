import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String a = cin.nextLine();
        int counter=0;

        for(int i =0; i<a.length();i++)
        {
            if(a.substring(i,i+1).equals("1"))
                counter++;
        }

        System.out.println(counter);
    }
}