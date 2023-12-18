import java.util.Scanner;
import java.math.BigDecimal;

public class Main{
    BigDecimal mx = new BigDecimal(9999);
    BigDecimal mn = new BigDecimal(0);
    int l;
    Main(){
	Scanner sc = new Scanner(System.in);

	while(sc.hasNext()){
	    String str = sc.next(), s1, s2;
	    char[] ch = str.toCharArray();
	    l = 0;
	    s1 = s2 = "";
	    while(!func(ch[l])){
		s1 += String.valueOf(ch[l++]);
	    }
	    if(s1.length() == 0){
		s1 = "0";
	    }
	    boolean f = true;
	    while(true){
		char c = ch[l++];
		if(comp(s1)){
		    System.out.println("E");
		    break;
		} 
		if(c == '='){
		    if(f){
			System.out.println("E");
		    } else {
			System.out.println(s1);
		    }
		    break;
		}

		while(!func(ch[l])){
		    s2 += String.valueOf(ch[l++]);
		}
		if(s2.length() == 0){
		    s2 = "0";
		}
		/*
		if(c == '+' && ch[l] == '*'){
		    s2 = calc2(s2, ch);
		}
		*/
		s1 = calc(s1, s2, c);
		s2 = "";
		f = false;
	    }
	}
    }

    boolean func(char w){
	if(w >= '0' && w <= '9'){
	    return false;
	}
	return true;
    }

    boolean comp(String str){
	BigDecimal r = new BigDecimal(str);
	if(r.compareTo(mx) == 1 || r.compareTo(mn) == -1){
	    return true;
	}

	return false;
    }

    String calc(String s1, String s2, char c){
	BigDecimal n = new BigDecimal(s1);
	BigDecimal m = new BigDecimal(s2);
	if(c == '+'){
	    n = n.add(m);
	} else if(c == '-'){
	    n = n.subtract(m);
	} else if(c == '*'){
	    n = n.multiply(m);
	}

	return n.toString();
    }

    String calc2(String str, char[] ch){
	String s1 = str, s2 = "";

	while(ch[l] == '*'){
	    l++;
	    while(!func(ch[l])){
		s2 += String.valueOf(ch[l++]);
	    }
	    if(s2.length() == 0){
		s2 = "0";
	    }
	    s1 = calc(s1, s2, '*');
	    s2 = "";
	}

	return s1;
    }

    public static void main(String[] args){
	new Main();
    }
}