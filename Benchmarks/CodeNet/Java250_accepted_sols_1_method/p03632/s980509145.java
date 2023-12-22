import java.util.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int kekka = 0;

        if(a < c){
        	if(c < b){
        		if(b < d){
        			kekka = b - c;
        		}
        		else{
        			kekka = d - c;
        		}
        	}
        }

        if(c < a){
        	if(a < d){
        		if( d < b){
        			kekka = d - a;
        		}
        		else{
        			kekka = b - a;
        		}
        	}
        }

        else if(a==c){
        	if (b < d){
        		kekka = b - a;
        	}
        	else{
        		kekka = d - a;
        	}
        }

        System.out.println(kekka);
    }
}