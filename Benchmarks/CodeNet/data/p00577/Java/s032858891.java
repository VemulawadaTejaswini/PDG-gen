import java.util.*;
class Main{
    public static void main(String[] av){
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	String S = sc.next();
	String Strarray[] = S.split("");
	int i = 0,cnt = 0;
	while(i < N-1){
	    if((Strarray[i].equals("X") && Strarray[i+1].equals("O"))||(Strarray[i].equals("O") && Strarray[i+1].equals("X"))){
		cnt++;
		i += 2;
	    }
	    else{
		i++;
	    }
	}
	System.out.println(cnt);
    }
}
