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

    int n = sc.nextInt();
    int count = 0;

    for(int a = 1 ; a <= n - 1 ; a++){
        count += ( n - 1 ) / a;
    }

    System.out.println(count);

    

   

    

    




    







}
}