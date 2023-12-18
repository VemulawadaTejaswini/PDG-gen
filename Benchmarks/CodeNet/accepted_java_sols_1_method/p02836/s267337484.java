//package atCoder;
//package atCoder;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        int count = 0;
        for(int i = 0; i < a.length()/2; i++)
        {
            if(a.charAt(i) != a.charAt(a.length()-1-i))
            {
                count++;
            }
        }
        System.out.println(count);
        
        scan.close();
    }

}
