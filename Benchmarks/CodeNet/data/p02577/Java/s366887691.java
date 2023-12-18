import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scan = new Scanner(System.in);
String         N = scan.next();
int p=0;
for(int i=0;i<N.length();i++){
    p=p+Integer.parseInt(N.substring(i,i+1));
}
p=p%9;
if(p==0){System.out.println("Yes");}
else{System.out.println("No");}
    }
}
