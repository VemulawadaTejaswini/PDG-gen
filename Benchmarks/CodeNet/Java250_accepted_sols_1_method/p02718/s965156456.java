import java.util.Scanner;
import java.util.ArrayList;
/**
 * Write a description of class Main_B here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Main
{

    public static void main(String[] args)
    {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        Scanner scan = new Scanner (System.in);
        int N = scan.nextInt();
        double M = scan.nextFloat();
        int contador = 0;
        int sumaTotal = 0;
        double valor = 0;
        double porcentaje = (1/(4*M));
        while(contador < N){
            int numerito = scan.nextInt();
            numeros.add(numerito);
            sumaTotal += numerito;
            contador++;
        }
        valor = sumaTotal*porcentaje;
        contador = 0;
        for(Integer a: numeros)
        {
            if(a >= valor){
                contador++;
            }
        }
        if(contador >= M)
        {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}