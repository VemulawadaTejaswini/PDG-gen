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
    //final List<Integer> list = new ArrayList<>();
    //final List<Long> list2 = new ArrayList<>();

    long w = sc.nextLong();
    long h = sc.nextLong();
    int x = sc.nextInt();
    int y = sc.nextInt();

    long ans = w * h;
    System.out.print((double)ans / 2);
    if(w == x * 2 && h == y * 2){
        System.out.print(" " + 1);
    }else{
        System.out.print(" " + 0);
    }



    



   
    





}
}