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

    int n = sc.nextInt();
    int m = sc.nextInt();
    int c = sc.nextInt();
    int hairetu1[] = new int[m];
    int hairetu2[][] = new int[n][m];
    int count = 0;
    int sum = 0;

    for(int i = 0 ; i < m ; i++){
        hairetu1[i] = sc.nextInt();
    }

    for(int i = 0 ; i < n ; i++){
        for(int j = 0 ; j < m ; j++){
            hairetu2[i][j] = sc.nextInt();
        }
    }

    for(int i = 0; i < n ; i++){
        for(int j = 0 ; j < m ; j++){
            sum += hairetu1[j] * hairetu2[i][j];
            //System.out.println(sum);
        }
        if(sum > -c){
            count++;
        }
        sum = 0;
    }

    System.out.println(count);







}
}