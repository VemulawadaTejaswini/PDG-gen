import java.io.*;
import java.util.*;

public class Main{

    public static final int M=1046527;
    public static final int L=14;
    
    static String H[]=new String[M];
    
    public static void main(String args[]) throws IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	Arrays.fill(H,"");
	
	int n=Integer.parseInt(br.readLine());

	for(int i=0;i<n;i++){
	    String str[]=br.readLine().split(" ");

	    if(str[0].equals("insert")){
		insert(str[1]);
	    }else{
		if(find(str[1]))
		    System.out.println("yes");
		else
		    System.out.println("no");
	    }
	}
    }

    static int getChar(char ch){
	if ( ch == 'A') return 1;
	else if ( ch == 'C') return 2;
	else if ( ch == 'G') return 3;
	else  if(ch=='T')return 4;
	else return -1;
    }

    static int getKey(String s){
	int sum = 0, p = 1;
	char str[]=s.toCharArray();
	
	for (int i = 0; i < str.length; i++ ){
	    sum += p*(getChar(str[i]));
	    p *= 5;
	}
	return sum;
    }

    static int h1(int key){
	return (key%M);
    }
    static int h2(int key){
	return 1+key%(M-1);
    }
    
    static boolean find(String s){
        int a=getKey(s);

	for(int i=0;;i++){
	    int j=(h1(a)+i*h2(a))%M;
	    if(H[j].equals(s)){
		return true;
	    }else if(H[j].length()==0){
		return false;
	    }
	}
	
    }
    
    static boolean insert(String s){
	int a=getKey(s);
        for (int i=0;;i++){
	    int j = (h1(a)+i*h2(a))%M;
	    if (H[j].equals(s)){
	        return true;
	    }else if(H[j].length()==0){
		H[j]=s;
		return false;
	    }
	}
    }
}

