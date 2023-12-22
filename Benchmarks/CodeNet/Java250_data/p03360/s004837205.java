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
    
    final Scanner sc = new Scanner(System.in);
    final List<Integer> list = new ArrayList<>();
    final List<Integer> list2 = new ArrayList<>();
    //final List<Long> list3 = new ArrayList<>();

    long a = sc.nextLong();
    long b = sc.nextLong();
    long c = sc.nextLong();
    int k = sc.nextInt();

    if(Math.max(Math.max(a,b),c) == a){
        for(int i = 0 ; i < k ; i++){
            a = 2 * a;
        }
        System.out.println(a + b + c);
    }else if(Math.max(Math.max(a,b),c) == b){
        for(int i = 0 ; i < k ; i++){
            b = 2 * b;
        }
        System.out.println(a + b + c);
    }else{
        for(int i = 0 ; i < k ; i++){
            c = 2 * c;
        }
        System.out.println(a + b + c);
    }

    

   

    

    




    







}
}