import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
class Main{  
    public static void main(String[] args) throws IOException {
          BufferedReader entrada= new BufferedReader( new InputStreamReader( System.in ),1024*8);
        int A[] = new int[10];
        int numero,i;
    for( i=0;i<10;i++)
    {
            numero=Integer.parseInt(entrada.readLine());
        A[i]=numero;
        
    }
    Arrays.sort(A);   
   
    System.out.println(""+A[9]+"\n"+A[8]+"\n"+A[7]); 
    
    }
    }