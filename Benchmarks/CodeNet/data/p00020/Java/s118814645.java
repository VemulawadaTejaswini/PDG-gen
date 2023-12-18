import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        boolean bool=true;
        while(s.hasNext()){
        	char[] a=s.next().toCharArray();
        	if(!bool)System.out.print(" ");
        	for(int i=0;i<a.length;i++){
        		if(a[i]>='a'&&a[i]<='z')a[i]-=32;
        		System.out.print(a[i]);
        	}
        	bool=false;
        }
    }
}