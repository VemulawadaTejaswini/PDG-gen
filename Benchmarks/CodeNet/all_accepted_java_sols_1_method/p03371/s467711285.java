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

    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int x = sc.nextInt();
    int y = sc.nextInt();
    int sum = 0;
    int sum2 = 1001001001;

    if(a + b >= 2*c){
        if(x>=y){
                sum += y*2*c;
                sum += (x-y)*a;
        }else{
                sum += x*2*c;
                sum += (y-x)*b;
        }
    }else{
        sum += a*x + b*y; 
    }

    if(a + b >= 2*c){
        if(x>=y){
            sum2 = x*2*c;
        }else{
            sum2 = y*2*c;
        }
    }

    System.out.println(Math.min(sum,sum2));

    

    




    







}
}