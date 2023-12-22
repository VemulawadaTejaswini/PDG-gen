import java.util.*;
public class Main{

 public static void main(String[] args) {
  Scanner no=new Scanner(System.in);
  String arr[]=new String[3];
  for(int i=0;i<3;i++){
    arr[i]=no.next();
  }
  int i=0;
  int j=0;
  int k=0;
  char c='a';
  while(true){
    if(c=='a'){
      if(i==arr[0].length()){
        System.out.println("A");
        break;
      }
      c=arr[c-'a'].charAt(i++);
    }
    else if(c=='b'){
      if(j==arr[1].length()){
        System.out.println("B");
        break;
      }
      c=arr[c-'a'].charAt(j++);
    }
    else{
      if(k==arr[2].length()){
        System.out.println("C");
        break;
      }
      c=arr[c-'a'].charAt(k++);
    }
  }
 }
}