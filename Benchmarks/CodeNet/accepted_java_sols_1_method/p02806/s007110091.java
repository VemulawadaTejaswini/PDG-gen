import java.util.Scanner;
 
public class Main{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int na=scan.nextInt();
String[] nb=new String[na+1];
int[] nc=new int[na];
 
int i=0;
for(i=0;i<na;i++){
  nb[i]=scan.next();
  nc[i]=scan.nextInt();
}
  nb[na]=scan.next();
 
int sum=0;
for(i=0;i<na;i++){
  if(nb[i].equals(nb[na])){
    break;
  }else{
    sum=sum+1;
  }
}
 
int summ=0;
for(i=sum+1;i<na;i++){
  summ=summ+nc[i];
}
     
System.out.println(summ);
     
}
}
  