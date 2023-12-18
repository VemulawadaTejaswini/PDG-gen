import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
       
        int c = sc.nextInt();
		int d = sc.nextInt();
        int e,f;
        if(a%d==0){e = a/d;}
        else{e=a/d+1;}
         if(c%b==0){f = c/b;}
        else{f=c/b+1;}
		if(e>=f){System.out.println("Yes");}
        else{System.out.println("No");}
	}
}