/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mi141311
 */
import java.io.*;
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException
    {
        // TODO code application logic here
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String buf = br.readLine();
        int x = Integer.parseInt(buf);
        int n = 1;
        for (int i = 0; i < 3; i++){
            n *= x;
        }
        System.out.println(n);
    }
    
}