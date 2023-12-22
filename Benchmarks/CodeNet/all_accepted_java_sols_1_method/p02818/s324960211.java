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
        long a = sc.nextLong();
        long b = sc.nextLong();
        long k = sc.nextLong();
        int count = 0;

        if(a >= k){
            a = a - k;
        }else{
            k = k - a;
            a = 0;
            if(b >= k){
                b = b - k;
            }else{
                b = 0;
            }
        }

        System.out.print(a + " " + b);
    
	}
}