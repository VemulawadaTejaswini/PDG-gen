import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        
        int[] count = new int[26];//count[0]<->'a',...count[25]<->'z'
        
        for(int h=0;h<H;h++){
        	String line = sc.next();
        	for(int w=0;w<W;w++) count[(line.charAt(w)-'a')]++;
        }
        
        boolean ans = true;
        if(H%2==0 && W%2==0){//all chars should appear 4*k times
        	for(int i=0;i<26;i++){
        	    if(count[i]%4!=0) ans=false;
        	}
        }
        else if(H%2!=0 && W%2!=0){
        	int oddChars = 0;
        	int oddTimes2Chars = 0;
        	for(int i=0;i<26;i++){
        	    if(count[i]%2!=0) oddChars++;
        	    else if(count[i]%4!=0) oddTimes2Chars++;
        	}
        	ans = (oddChars<=1) && (oddTimes2Chars<=H/2+W/2);
        }
        else if(H%2==0 && W%2!=0){
        	int oddChars = 0;
        	int oddTimes2Chars = 0;
        	for(int i=0;i<26;i++){
        	    if(count[i]%2!=0) oddChars++;
        	    else if(count[i]%4!=0) oddTimes2Chars++;
        	}
        	ans = (oddChars==0) && (oddTimes2Chars<=H/2);
        }
        else{
        	int oddChars = 0;
        	int oddTimes2Chars = 0;
        	for(int i=0;i<26;i++){
        	    if(count[i]%2!=0) oddChars++;
        	    else if(count[i]%4!=0) oddTimes2Chars++;
        	}
        	ans = (oddChars==0) && (oddTimes2Chars<=W/2);
        }
        if(ans) System.out.println("Yes");
        else System.out.println("No");
    }
}