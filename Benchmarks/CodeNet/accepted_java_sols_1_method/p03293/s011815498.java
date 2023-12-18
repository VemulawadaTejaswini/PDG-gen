import java.util.Scanner;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
String s = sc.next();
String t = sc.next();
char[] a = s.toCharArray();
char[] b = t.toCharArray();
boolean ok = true;
int n = s.length();
for(int i = 0;i < n;i++) {
	ok = true;
	for(int j = 0;j < n-i;j++) {
		if(a[j] != b[j+i]) {
			ok = false;
			break;
		}
	}
	for(int j = n-i;j < n;j++) {
		if(a[j] != b[j-n+i]) {
			ok = false;
			break;
		}
	}
	if(ok)break;
}
System.out.println(ok? "Yes":"No");
}}