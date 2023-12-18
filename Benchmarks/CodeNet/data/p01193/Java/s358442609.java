import java.util.Scanner;

public class Main{
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
		int res = Integer.parseInt(s1);
		if(res >= 10000 || res < 0){
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

    String calc(String s1, String s2, char c){
	int n = Integer.parseInt(s1);
	int m = Integer.parseInt(s2);
	if(c == '+'){
	    n += m;
	} else if(c == '-'){
	    n -= m;
	} else if(c == '*'){
	    n *= m;
	} else {
	    n /= m;
	}

	return String.valueOf(n);
    }

    public static void main(String[] args){
	new Main();
    }
}