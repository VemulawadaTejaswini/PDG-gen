import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader( System.in ));
        int x[]= new int[10];
        int n;
        for( int i = 0 ; i < 10 ; i++ )x[i] = Integer.parseInt( br.readLine());
        for(int i=0;i<3;i++){
            for(int j=i;j<10;j++){
                if(x[i]<x[j]){
                    n=x[i];
                    x[i]=x[j];
                    x[j]=n;
                }
            }
        }
        for(int i = 0 ; i < 3 ; i++ )System.out.println( x[i] );
    }
}

