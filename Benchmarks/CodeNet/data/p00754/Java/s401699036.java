import java.util.Scanner;

public class Balance{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  String passage;
  int counter1=0,counter2=0;
  do{
  passage=sc.nextLine();
  String[] ch =passage.split("");
  for(int i=0;i<passage.length();i++){
   if(ch[i].equals("[")) counter1++;
   if(ch[i].equals("]")) counter1--;
   if(ch[i].equals("(")) counter2++;
   if(ch[i].equals(")")) counter2--;
  }
  if(!passage.equals(".")){
  if(counter1==0&&counter2==0)
   System.out.println("yes");
  else
   System.out.println("no");
 }
  }while(!passage.equals("."));

 }
}