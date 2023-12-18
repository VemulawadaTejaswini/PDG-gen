import java.io.*;
import java.util.*;
import java.math.BigInteger;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

   String nyuA=sc.nextLine();
  // String nyuB=sc.nextLine();
 
   //  String[] O=sc.nextLine().split(" ");
     String[] E=sc.nextLine().split(" ");

//int n=Integer.parseInt(nyuA);

//int H=Integer.parseInt(O[0]);
//int W=Integer.parseInt(O[1]);

ArrayList<Integer> list=new ArrayList<>();
for(int i=0;i<E.length;i++){
list.add(Integer.parseInt(E[i]));
}

Collections.sort(list);
int res=list.get(list.size()-1)-list.get(0);
System.out.println(res);



//long H=Long.parseLong(t[0]);
//long W=Long.parseLong(t[1]);
//long C=Long.parseLong(t[2]);


	}
}