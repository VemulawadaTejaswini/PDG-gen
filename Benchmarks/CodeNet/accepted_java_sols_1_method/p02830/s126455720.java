import java.util.Scanner;

public class Main{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int na=scan.nextInt();  
String nb=scan.next();
String nc=scan.next();
  
String[] mb=nb.split("");
String[] mc=nc.split("");
  
String[] md=new String[2*na];
for(int i=0;i<na;i++){
    md[2*i]=mb[i];
    md[2*i+1]=mc[i];
}

  String nd=String.join("",md);
  System.out.println(nd);

}
}
