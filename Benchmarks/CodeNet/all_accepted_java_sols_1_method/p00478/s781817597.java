import java.util.Scanner;

public class Main{
    Main(){
	Scanner sc = new Scanner(System.in);

	while(sc.hasNext()){
	    String s1 = sc.next();
	    char[] ch1 = s1.toCharArray();
	    int n = sc.nextInt();
	    int c = 0;
	    for(int i = 0; i < n; i++){
		String s2 = sc.next();
		char[] ch2 = s2.toCharArray();
		for(int j = 0; j < s2.length(); j++){
		    if(ch1[0] == ch2[j]){
			boolean f = true;
			int t = j;
			for(int k = 1; k < s1.length(); k++){
			    if(k+t == s2.length()){
				t = -k;
			    }
			    if(ch1[k] != ch2[t+k]){
				f = false;
				break;
			    }
			}
			if(f){
			    c++;
			    break;
			}
		    }
		}
	    }

	    System.out.println(Integer.toString(c));
	}
    }

    public static void main(String[] args){
	new Main();
    }
}