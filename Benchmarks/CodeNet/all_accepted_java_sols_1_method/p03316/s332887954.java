// Java implementation of Kosaraju's algorithm to print all SCCs
import java.io.*;
import java.util.*;
import java.util.LinkedList;

// This class represents a directed graph using adjacency list
// representation
public class Main
{ // Driver method
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        String str=""+n;
        int sum=0;
        for (int i = 0; i < str.length(); i++) {
            sum+=str.charAt(i)-'0';
        }
        if(n%sum==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}