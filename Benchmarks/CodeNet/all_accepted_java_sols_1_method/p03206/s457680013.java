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
    int d = sc.nextInt();

    if(d == 24){
        System.out.println("Christmas Eve");
    }else if(d == 23){
        System.out.println("Christmas Eve Eve");
    }else if(d == 22){
        System.out.println("Christmas Eve Eve Eve");
    }else{
        System.out.println("Christmas");
    }
    
	}
}