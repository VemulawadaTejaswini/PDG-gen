import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
 
//      String[] t=sc.nextLine().split("");
//    String nyuA=sc.nextLine();
   String nyu=sc.nextLine();

//int n=Integer.parseInt(nyu);

//int A=Integer.parseInt(t[0]);
//int B=Integer.parseInt(t[1]);

HashSet<String> list=new HashSet<>();

String[] t=nyu.split("");

for(String tem:t)list.add(tem);

ArrayList<String> list2=new ArrayList<>(list);
int flag=0;
for(String temptemp:list2){
int count=0;
for(String temptemps:t){
if(temptemp.equals(temptemps))count++;
}//fort
if(count%2!=0)flag=1;
}//for

if(flag==0)
System.out.println("Yes");
else
System.out.println("No");


	}
}