import java.util.*;

public class Main{
    static List<String> cipher;
    static String[] alpha = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};

    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	//while(sc.hasNext()){

	    cipher = new ArrayList<String>();
	    while(sc.hasNext()){
		String date = sc.next();
		cipher.add(date);
	    }
	    
	    String ans = solve();

	    System.out.println(ans);
	    //}
    }

    public static String solve(){

	for(int i=0; i<cipher.size(); i++){
	    String one = (cipher.get(i)).substring(0,1);
	    int dist = 0;
	    for(int j=0; j<alpha.length; j++){
		if(one.equals(alpha[j])){dist = j; break;}
	    }
	    dist = 19 - dist;
	    if(check(dist)){return toString(dist);}
	}
	
	return "";
    }

    public static boolean check(int dist){
	for(int i=0; i<cipher.size(); i++){
	    String str = cipher.get(i);
	    String ans = "";
	    if(str.length()==3 || str.length()==4){
		for(int j=0; j<str.length(); j++){
		    String str2 = str.substring(j,j+1);
		    if(str2.equals(".")){ans+=".";}
		    else{
			int key = getKey(str2,dist);
			ans += alpha[key];
		    }
		}
		if(ans.equals("this") || ans.equals("that") || ans.equals("the")){
		    return true;
		}
	    }
	}
	return false;
    }
    
    public static String toString(int dist){
	for(int i=0; i<cipher.size(); i++){
	    String str = cipher.get(i);
	    String ans = "";
	    for(int j=0; j<str.length(); j++){
		String str2 = str.substring(j,j+1);
		if(str2.equals(".")){ans+=".";}
		else{
		    int key = getKey(str2,dist);
		    ans += alpha[key];
		}
	    }
	    cipher.set(i,ans);	    
	}
	String finalAns = "";
	for(int i=0; i<cipher.size()-1; i++){
	    finalAns += cipher.get(i) + " ";
	}  
	finalAns += cipher.get(cipher.size()-1);

	return finalAns;
    }
    
    public static int getKey(String one,int dist){
	int key = 0;
	for(int k=0; k<alpha.length; k++){
	    if(one.equals(alpha[k])){
		key = k + dist;
		if(key>25){key = key-25;}
		else if(key<0){key = key+25;}
	    }
	}
	return key;
    }
}