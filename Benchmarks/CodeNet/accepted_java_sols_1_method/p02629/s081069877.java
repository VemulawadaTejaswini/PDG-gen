import java.util.*;

class Main{

  public static void main(String args[]){

    Scanner s=new Scanner(System.in);
    long N=s.nextLong();
    String ans="";
	for(;0<N;){
      char c=(char)((N-1)%26+97);
      ans=String.valueOf(c)+ans;
      N=(N-1)/26;
    }
    System.out.println(ans);

  }  
}