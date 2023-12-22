import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args) throws IOException
    {
        //Declaración objeto tipo lector.
        //BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();
        scan.close();
        int guardar = x;
        
        //Cambio 
        x = z;
        z = y;
        y = guardar;
        
        System.out.println(x + " " + y + " " + z);
        
    }
}

