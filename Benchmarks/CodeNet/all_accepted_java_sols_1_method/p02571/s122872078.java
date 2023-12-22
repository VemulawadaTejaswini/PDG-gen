import java.util.*;
 
public class Main{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String S=sc.nextLine();
    String T=sc.nextLine();
    int shortest=1001;
	int data=0;
    char[] Schar=S.toCharArray();
    char[] Tchar=T.toCharArray();
    for(int i=0;i<Schar.length-Tchar.length+1;i++){
      data=0;
      for(int j=0;j<Tchar.length;j++){
       	if(Schar[i+j]!=Tchar[j]){
          data++;
        }
      }
	  if(data<shortest){
        shortest=data;
      }
       
    }
 
   System.out.println(shortest);   
  
  }
}