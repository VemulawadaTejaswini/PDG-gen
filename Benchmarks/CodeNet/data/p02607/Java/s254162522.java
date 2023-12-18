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
    List<Integer> list = new ArrayList<>();
    int count = 0;

    for(int i = 1; i < n + 1 ; i++){
        list.add(sc.nextInt());
    }

    for(int i = 1; i < n + 1 ; i++){
        if(i % 2 == 1 && list.get(i - 1) % 2 == 1){
            count++;
        }
    }

    System.out.println(count);







    





}
}