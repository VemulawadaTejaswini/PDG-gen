import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
	String[] vowel ={"a","i","u","e","o"};
	String C =sc.next();
	for(int i=0;i<vowel.length;i++){
	if(C.equals(vowel[i])){
	System.out.println("vowel");
	break;
	}
	if(i==vowel.length-1)System.out.println("consonant");
	}
	}
	}