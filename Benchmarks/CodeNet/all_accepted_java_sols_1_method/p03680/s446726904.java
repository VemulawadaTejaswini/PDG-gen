import java.io.*;
import java.util.*;
import java.math.BigInteger;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

   String nyuA=sc.nextLine();
  // String nyuB=sc.nextLine();
 
   //  String[] O=sc.nextLine().split(" ");
//     String[] E=sc.nextLine().split(" ");

int n=Integer.parseInt(nyuA);

//int H=Integer.parseInt(O[0]);
//int W=Integer.parseInt(O[1]);

int[] num=new int[n];

for(int i=0;i<n;i++){
num[i]=Integer.parseInt(sc.nextLine())-1;
}

int count=0;
int flag=0;
int res=-1;
int button=0;
while(true){
count=num[count];
button++;
if(count==1){
res=button;
break;
}
if(button>=n+2)break;
}

System.out.println(res);



//long H=Long.parseLong(t[0]);
//long W=Long.parseLong(t[1]);
//long C=Long.parseLong(t[2]);


	}
}