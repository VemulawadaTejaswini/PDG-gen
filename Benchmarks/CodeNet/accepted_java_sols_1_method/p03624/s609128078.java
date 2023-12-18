import java.io.*;
import java.util.*;
import java.math.BigInteger;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

//   String nyuA=sc.nextLine();
  // String nyuB=sc.nextLine();
 
    String[] s=sc.nextLine().split("");
//     String[] e=sc.nextLine().split(" ");

//int n=Integer.parseInt(nyuA);

//int A=Integer.parseInt(s[0]);
//int B=Integer.parseInt(s[1]);


HashSet<String> list=new HashSet<>();

for(String temp:s){
list.add(temp);
}
ArrayList<String> set=new ArrayList<>(list);
Collections.sort(set);

String[] abc={"a","b","c","d","e","f","g","h","i","j","k","l","n","m",
"o","p","q","r","s","t","u","v","w","x","y","z"};

ArrayList<String>res=new ArrayList<>();
HashSet<String>te=new HashSet<>();

for(String tem:set){
for(int i=0;i<abc.length;i++){
if(tem.equals(abc[i]))abc[i]="0";
}
}

for(int i=0;i<abc.length;i++){
if(!"0".equals(abc[i]))res.add(abc[i]);
}
Collections.sort(res);
if(res.size()==0){
System.out.println("None");

}else
System.out.println(res.get(0));

//long H=Long.parseLong(t[0]);
//long W=Long.parseLong(t[1]);
//long C=Long.parseLong(t[2]);


	}
}