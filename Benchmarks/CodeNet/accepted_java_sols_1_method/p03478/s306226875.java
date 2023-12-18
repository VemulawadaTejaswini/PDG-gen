import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();int m=sc.nextInt();int a=sc.nextInt();
  int count=0;
  for(int i=0;i<=n;i++){
  	String po=i+"";
    String[]popo=po.split("",0);
    int p=0;
    for(int j=0;j<popo.length;j++)p+=Integer.parseInt(popo[j]);
    if(m<=p&&p<=a)count+=i;
  }
  System.out.println(count);
}
}
