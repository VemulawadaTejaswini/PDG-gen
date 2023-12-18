import java.util.Scanner;
import java.util.ArrayList;

public class Main{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
 ArrayList<String> code =new ArrayList<String>();
 int i=0;
 String tmp;
 do{
  tmp =sc.next();
  if(!tmp.equals("-")){
  int shuffle =sc.nextInt();
  for(int k=0;k<shuffle;k++){
    int h=sc.nextInt();
    String draw_card = tmp.substring(0,h);
    String rem_card=tmp.substring(h,tmp.length());
    tmp=rem_card + draw_card;
  }
}
  code.add(i,tmp);
  i++;
}while(!tmp.equals("-"));
 for(int j=0;j<i-1;j++){
   System.out.println(code.get(j));
 }
 }
}