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

    long r = sc.nextLong();
    long d = sc.nextLong();
    long x = sc.nextLong();

    for(int i = 0; i < 10 ; i++){
        x = r * x - d;
        System.out.println(x);
    }



    



   
    





}
}