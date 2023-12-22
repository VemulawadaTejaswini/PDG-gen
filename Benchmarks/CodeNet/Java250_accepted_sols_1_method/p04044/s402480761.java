import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
 
      String[] t=sc.nextLine().split(" ");
//    String nyuA=sc.nextLine();
//   String nyu=sc.nextLine();

//int n=Integer.parseInt(nyu);

int A=Integer.parseInt(t[0]);
int B=Integer.parseInt(t[1]);
ArrayList<String> list=new ArrayList<>();
for(int i=0;i<A;i++){
list.add(sc.nextLine());
}
Collections.sort(list);
for(String tem:list)
System.out.print(tem);

System.out.println();


	}
}