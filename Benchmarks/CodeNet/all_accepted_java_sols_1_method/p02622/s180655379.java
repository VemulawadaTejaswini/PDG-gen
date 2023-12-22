import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        char[] t = sc.next().toCharArray();

        int res=s.length;
        for(int i=0; i<s.length; i++){
            if(s[i] == t[i]){
                res--;
            }
        }
        System.out.println(res);
        }
    }