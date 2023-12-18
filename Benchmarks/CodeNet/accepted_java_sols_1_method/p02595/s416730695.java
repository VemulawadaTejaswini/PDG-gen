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
    final List<Long> list = new ArrayList<>();
    final List<Long> list2 = new ArrayList<>();
    int n = sc.nextInt();
    long d = sc.nextLong();
    int count = 0;
    long dis = 0;
    long d2 = d*d;

    for(int i = 0; i < n ; i++){
        list.add(sc.nextLong());
        list2.add(sc.nextLong());
    }

    for(int i = 0; i < n ; i++){
        dis = list.get(i) * list.get(i) + list2.get(i) * list2.get(i);
        if(dis <= d2){
            count++;
        }
        //System.out.println(dis + " " + d2);
    }

    System.out.println(count);

    
    






}
}