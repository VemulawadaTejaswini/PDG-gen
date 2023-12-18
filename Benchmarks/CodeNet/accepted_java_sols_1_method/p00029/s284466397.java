import java.util.*;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	String[] line = sc.nextLine().split(" ");
	int[] hindo = new int[line.length];
	int max = 0;
	int maxLen = 0;
	for(int i=0; i<line.length; i++){
	    if(line[i].length()>max){max = line[i].length(); maxLen = i;}
	    for(int j=i; j<line.length; j++){
		if(line[i].equals(line[j])){
		    hindo[j]++;
		}
	    }
	}

	max = 0;
	for(int i=0; i<hindo.length; i++){
	    if(hindo[i]>max){max = i;}
	}

	System.out.println(line[max]+" "+line[maxLen]);
    }
}