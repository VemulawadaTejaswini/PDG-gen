import java.util.Scanner;

public class Main{
    public Main(){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();

	for(int i = 0; i < n; i++){
	    String str = sc.next();
	    int l = str.length();
	    String[] a = new String[4*l*l];
	    int p = 0;

	    for(int j = 1; j < l; j++){
		String s1 = str.substring(0, j);
		String s2 = str.substring(j, l);
		String rs1 = reverse(s1);
		String rs2 = reverse(s2);
		
		if(strcomp(s1+s2, a, p)){
		    a[p++] = s1+s2;
		}
		if(strcomp(s1+rs2, a, p)){
		    a[p++] = s1+rs2;
		}
		if(strcomp(rs1+s2, a, p)){
		    a[p++] = rs1+s2;
		}
		if(strcomp(rs1+rs2, a, p)){
		    a[p++] = rs1+rs2;
		}
		if(strcomp(s2+s1, a, p)){
		    a[p++] = s2+s1;
		}
		if(strcomp(s2+rs1, a, p)){
		    a[p++] = s2+rs1;
		}
		if(strcomp(rs2+s1, a, p)){
		    a[p++] = rs2+s1;
		}
		if(strcomp(rs2+rs1, a, p)){
		    a[p++] = rs2+rs1;
		}
	    }
	    System.out.println(Integer.toString(p));
	}
    }

    private boolean strcomp(String str, String[] a, int p){
	for(int i = 0; i < p; i++){
	    if(str.equals(a[i])){
		return false;
	    }
	}

	return true;
    }

    private String reverse(String str){
	String rstr = "";

	for(int i = str.length(); i > 0; i--){
	    rstr += str.substring(i-1, i);
	}

	return rstr;
    }

    public static void main(String[] args){
	new Main();
    }
}