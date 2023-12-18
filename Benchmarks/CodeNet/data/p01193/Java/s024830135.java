import java.util.Scanner;
import java.math.BigDecimal;

public class Main{
    BigDecimal mx = new BigDecimal(9999);
    BigDecimal mn = new BigDecimal(1);
    Main(){
	Scanner sc = new Scanner(System.in);

	while(sc.hasNext()){
	    String str = sc.next(), s1, s2;
	    char[] ch = str.toCharArray();
	    int l = str.length();
	    if(func(ch[0])){
		str = "0";
	    } else {
		str = "";
	    }
	    for(int i = 0; i < l; i++){
		if(i+1 < l && func(ch[i]) && func(ch[i+1])){
		    str += (String.valueOf(ch[i]) + "0");
		} else {
		    str += String.valueOf(ch[i]);
		}
	    }
	    ch = str.toCharArray();
	    l = 0;
	    s1 = s2 = "";
	    while(!func(ch[l])){
		s1 += String.valueOf(ch[l++]);
	    }
	    while(true){
		char c = ch[l++];
		if(comp(s1)){
		    System.out.println("E");
		    break;
		} else if(c == '='){
		    System.out.println(s1);
		    break;
		}

		while(!func(ch[l])){
		    s2 += String.valueOf(ch[l++]);
		}

		s1 = calc(s1, s2, c);
		s2 = "";
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

    public static void main(String[] args){
	new Main();
    }
}