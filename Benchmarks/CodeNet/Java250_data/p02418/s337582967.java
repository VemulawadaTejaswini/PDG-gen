

import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        line = line.concat(line);
        String pattern = sc.nextLine();
        if(line.contains(pattern)) System.out.println("Yes");
        else System.out.println("No");
        
   
    }
}
