import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        int change = 0;
        
        while(true){
        	if(A%2!=0||B%2!=0||C%2!=0)break;
        	int nextA = (B+C)/2;
        	int nextB = (C+A)/2;
        	int nextC = (A+B)/2;
        	change++;
        	if(nextA%2!=0 || nextB%2!=0 || nextC%2!=0) break;
        	int minimum = Math.min(Math.min(nextA,nextB),nextC);
        	A = nextA;
        	B = nextB;
        	C = nextC;
        	if(nextA==nextB&&nextA==nextC){
        		change=-1;
        		break;
        	}
        }
        System.out.println(change);
    }
}