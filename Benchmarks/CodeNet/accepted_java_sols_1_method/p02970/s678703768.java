import java.io.BufferedReader;
import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;

public class Main {
	public static void main(final String[] args){
    
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int d = sc.nextInt();

        int sv = 2 * d + 1;

        if(n % sv == 0){
            System.out.println(n / sv);
        }else{
            System.out.println(n / sv + 1);
        }
        
        

        






    }
}