import java.io.*;
import java.util.*;
import java.math.BigInteger;
public class Main {
static  Scanner sc = new Scanner(System.in);


public static void main(String[] args) {
int N ; 
String tr=sc.nextLine();
N=Integer.parseInt(tr);

while(true){
String s="";
s=(N+"");
HashSet<String> list=new HashSet<>();
String[] temp=s.split("");
for(String t:temp)list.add(t);
if(list.size()==1){
System.out.println(s);
break;
}
//System.out.println(N);
N++;
}

}

}


