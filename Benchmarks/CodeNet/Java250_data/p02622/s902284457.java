import java.util.*;
import java.io.*;
class Main {

	//最大公約数・最小公倍数（セットで使う）
static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}
static int lcm (int a, int b) {return a*b/gcd(a,b);}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
      	
      	String s = sc.next();
      	String t = sc.next();
      	int cnt = 0;
      	
      	for(int i=0;i<s.length();i++){
        	if(s.charAt(i) != t.charAt(i)){
            	cnt++;
          }
        }
      System.out.println(cnt);
      }
	}