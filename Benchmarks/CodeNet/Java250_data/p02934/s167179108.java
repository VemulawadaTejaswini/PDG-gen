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
    List<Double> list = new ArrayList<>();
    int n = sc.nextInt();
    double sum = 0;

    for(int i = 0 ; i < n ; i++){
        list.add(sc.nextDouble());
    }

    for(int i = 0 ; i < n ; i++){
        sum += 1/ list.get(i);
    }

    System.out.println(1 / sum);



    
    
    







}
}