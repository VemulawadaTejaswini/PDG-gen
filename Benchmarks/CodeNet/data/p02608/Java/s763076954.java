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
        for(int x = 1 ; x < 105 ; x++){
            for(int y = 1 ; y < 105; y++){
                for(int z = 1 ; z < 105 ; z++){
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