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
    //final List<Integer> list2 = new ArrayList<>();
    //final List<Long> list3 = new ArrayList<>();

    int s = sc.nextInt();
    int count = 1;
    int n = s;
    int check = 0;
    list.add(s);
    for(int i = 1 ; i < 50000 ; i++){
        if(n % 2 == 0){
            n = n / 2;
            list.add(n);
        }else{
            n = n*3 + 1;
            list.add(n);
        }
        count++;
        Collections.sort(list);
        for(int j = 0 ; j < list.size() - 1; j++){
            if(list.get(j).equals(list.get(j+1))){
                check = 1;
                break;
            }

        }
        if(check == 1){
            break;
        }
    }

    //System.out.println(list);
    System.out.println(count);
    

    

    




    







}
}