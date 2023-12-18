import java.util.Scanner;
public class Prueba
{
    // Entradas
    int[] datos;
    //Salidas
    int posicion0 = 0;
    
    public void algoritmo( ){
        for(int i=0; i < 5; i++){
            if(posicion0 == datos[i])posicion0 = i+1;
        }
    }//fin method
  
    public void main(String[] args){
        Scanner in = new Scanner(System.in);
        datos = new int[5];
        for(int i = 0; i < 5; i++){
            datos[i] = in.nextInt();
        }
        
        algoritmo();
        
        System.out.println(posicion0);
    }//fin method2
}