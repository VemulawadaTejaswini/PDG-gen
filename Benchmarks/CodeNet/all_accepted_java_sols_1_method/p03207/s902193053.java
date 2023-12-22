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
    List<Integer> list = new ArrayList<>();
    int sum = 0;
    for(int i = 0; i < n; i++){
        list.add(sc.nextInt());
    }

    Collections.sort(list);
    int a = list.get(n-1);
    a = a/2;
    list.set(n-1,a);

    for(int i = 0; i < n; i++){
        sum += list.get(i);
    }
    System.out.println(sum);
    
    
	}
}