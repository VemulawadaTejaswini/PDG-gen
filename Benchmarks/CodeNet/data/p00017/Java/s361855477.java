import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        String retext = "";
        for(int i=0; i<28; i++){
        	retext = retext+String.valueof((char)(text.charAt(i) -no));
        	if(retext.indexof("the") !=1){
        		System.out.println(retext);
        		break;
        		}else if(retext.indexof("this") !=1){
        		System.out.println(retext);
        		break;
        		}else if(retext.indexof("that") !=1){
        		System.out.println(retext);
        		break;
        		}else{
        		}
        	}
        }
       }