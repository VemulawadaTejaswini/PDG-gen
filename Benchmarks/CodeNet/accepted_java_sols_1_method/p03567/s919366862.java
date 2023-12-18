import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String submit = sc.next();
        int L = submit.length();
        boolean accepted = false;
        for(int i=0;i<L-1;i++){
        	if(submit.charAt(i)=='A'&&submit.charAt(i+1)=='C') accepted = true;
        }
        System.out.println(accepted?"Yes":"No");
    }
}