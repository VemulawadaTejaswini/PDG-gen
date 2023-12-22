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
    int k = sc.nextInt();
    int x = sc.nextInt();
    List<Integer> list = new ArrayList<>();
    int minas = 0;
    int plus = 0;

    minas = x - k + 1;
    plus = x + k - 1;

    for(int i = minas; i <= plus ; i++){
        System.out.print(i + " ");
    }
    


    


    

    
    
    



    





}
}