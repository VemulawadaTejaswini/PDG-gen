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
    int k = sc.nextInt();
    List<Integer> list = new ArrayList<>();
    int judge = 1000000000;
    for(int i = 0; i < n ; i++){
        list.add(sc.nextInt());
    }
    Collections.sort(list);
    for(int i = 0; i < n - k + 1; i++){
        if(list.get(i + k - 1) - list.get(i) < judge){
            judge = list.get(i + k - 1) - list.get(i);
        }
    }
    System.out.println(judge);
    
	}
}