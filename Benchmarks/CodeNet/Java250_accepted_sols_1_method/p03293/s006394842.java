import java.io.*;
import java.util.*;
import java.math.BigInteger;
public class Main {



	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);


String S=sc.nextLine();
String T=sc.nextLine();

boolean ans=false;

for(int i=0;i<S.length();++i){
if(S.equals(T)){
ans=true;
break;
}
S=S.substring(S.length()-1,S.length())+S.substring(0,S.length()-1);
}
if(ans){
System.out.println("Yes");
}else{
System.out.println("No");
}

}

}

