import java.util.*;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	while(sc.hasNext()){
	    String[] line = sc.nextLine().split(" ");
	    boolean equal = false;
	    for(int i=0; i<26; i++){
		for(int j=0; j<line.length; j++){
		    if(line[j].equals("this") || line[j].equals("that") || line[j].equals("the")){equal = true;}
		}
		if(equal){break;}
		for(int j=0; j<line.length; j++){
		    char[] a = line[j].toCharArray();
		    for(int k=0; k<a.length; k++){
			if(Character.isLowerCase(a[k]))
			    a[k] = (char)((a[k]-'a'+1)%26+'a');
		    }
		    line[j] = new String(a);
		}
	    }
	    for(int i=0; i<line.length-1; i++){
		System.out.print(line[i]+" ");
	    }
	    System.out.println(line[line.length-1]);
	}
    }
}