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
    int sum = 0;

    for(int i = 0 ; i < n - 1 ; i++){
        list.add(sc.nextInt());
    }

    if(n == 2){
        System.out.println(list.get(0)*2);
        System.exit(0);
    }
    for(int i = 0 ; i < n - 2; i++){
        if(i == 0){
            if(list.get(i) > list.get(i + 1)){
                sum += list.get(i)+list.get(i+1);
            }else{
                sum += list.get(i)*2; 
            }
        }else{
            if(list.get(i) > list.get(i+1)){
                sum += list.get(i+1);
            }else{
                sum += list.get(i);
            }
        }

        if(i == n - 3){
            sum += list.get(i+1);
        }
    }

    System.out.println(sum);
    



    





}
}