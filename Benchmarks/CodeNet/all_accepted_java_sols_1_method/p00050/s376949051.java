import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	String str;
	String res="";
	while(input.hasNext()){
	    str=input.next();
	    for(int i=0;i<str.length()-4;i++){
		if((str.substring(i,i+5)).equals("apple"))
		    str=str.replaceAll("apple","peach");
		else if((str.substring(i,i+5)).equals("peach"))
		    str=str.replaceAll("peach","apple");
	    }
	    res=res.concat(str+" ");
	}
	System.out.println(res.trim());
	input.close();
    }
}