import java.io.BufferedReader;
import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;

public class Main {
	public static void main(final String[] args){
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count = 0;

    for(int i = 1; i < n + 1; i++){
        for(int x = 1 ; x < Math.pow( n, 3/2 ) ; x++){
            for(int y = 1 ; y < Math.pow( n, 3/2 ); y++){
                for(int z = 1 ; z < Math.pow( n, 3/2 ) ; z++){
                        if(x*x + y*y + z*z + x*y + x*z + y*z == i){
                            count++;
                        }
                }
            }
        }
        System.out.println(count);
        count = 0;
      
    }







    





}
}