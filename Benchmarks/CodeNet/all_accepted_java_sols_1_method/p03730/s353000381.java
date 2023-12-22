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
    
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    int sum = 0;
    int count = 0;

    for(int i = 0 ; i < 100000 ; i++){
        sum += a % b;
        sum = sum % b;
        if(sum == c){
            count++;
        }
    }

    if(count == 0){
        System.out.println("NO");
    }else{
        System.out.println("YES");
    }




    





    
    


    
	}
}