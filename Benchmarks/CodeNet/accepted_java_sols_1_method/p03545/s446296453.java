import java.util.*;

public class Main{
	
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String[] s=sc.next().split(""),ops={"+","+","+"};
  	int[] n=new int[4];
    int sum=0;
    for(int i=0;i<4;i++){
      n[i]=Integer.parseInt(s[i]);
      
    }
    if(n[0]+n[1]+n[2]+n[3]==7){
      System.out.println(s[0]+"+"+s[1]+"+"+s[2]+"+"+s[3]+"=7");
    }else if(n[0]+n[1]+n[2]-n[3]==7){
      System.out.println(s[0]+"+"+s[1]+"+"+s[2]+"-"+s[3]+"=7");
    }else if(n[0]+n[1]-n[2]+n[3]==7){
      System.out.println(s[0]+"+"+s[1]+"-"+s[2]+"+"+s[3]+"=7");
    }else if(n[0]+n[1]-n[2]-n[3]==7){
      System.out.println(s[0]+"+"+s[1]+"-"+s[2]+"-"+s[3]+"=7");
    }else if(n[0]-n[1]-n[2]-n[3]==7){
      System.out.println(s[0]+"-"+s[1]+"-"+s[2]+"-"+s[3]+"=7");
    }else if(n[0]-n[1]-n[2]+n[3]==7){
      System.out.println(s[0]+"-"+s[1]+"-"+s[2]+"+"+s[3]+"=7");
    }else if(n[0]-n[1]+n[2]-n[3]==7){
      System.out.println(s[0]+"-"+s[1]+"+"+s[2]+"-"+s[3]+"=7");
    }else{
      System.out.println(s[0]+"-"+s[1]+"+"+s[2]+"+"+s[3]+"=7");
    }
  }
}
